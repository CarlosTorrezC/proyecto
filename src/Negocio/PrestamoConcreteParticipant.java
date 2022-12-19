
package Negocio;

import Datos.DetallePrestamo;
import Datos.Libro;
import Datos.Prestamo;
import java.util.ArrayList;
import javax.swing.Timer;

public class PrestamoConcreteParticipant implements ISpecificTransaction {
    private Prestamo prestamo;
   
    private int idTransaction;
    
    public PrestamoConcreteParticipant(){}
    
    public PrestamoConcreteParticipant(int idTransaction, Prestamo prestamo){
        this.prestamo=prestamo;
        this.idTransaction=idTransaction;
    }
      
    @Override
    public String save(int idTransaction, Prestamo prestamo, ArrayList<DetallePrestamo> detalle) {
        this.idTransaction = idTransaction;
        this.prestamo = prestamo;
        String response;
        try{
            //BEGINTRANSACTION
            join(idTransaction);
            //PASO1
            int idPrestamo=prestamo.save();  
            System.out.println("IdPrestamo - " + idPrestamo);
            if (detalle.isEmpty()) throw new Exception("Sin Libros a Prestar");
            Libro libro= new Libro();
             //PASO2
            for (DetallePrestamo detallePrestamo : detalle) {
               if (! libro.validate_stock(detallePrestamo.CodigoLibro)){
                   throw new Exception("libro sin stock");
               }       
                detallePrestamo.save(idPrestamo);
                libro.update(detallePrestamo.CodigoLibro);
            } 
             //PASO3
            prestamo.update_quantity(idPrestamo);
             //COMMIT
            commit(idTransaction);
            response="Transaccion Realizada.";           
        }catch(Exception e){
            //ROLLBACK
            cancel(idTransaction);
            response="Roolback - "+e.getMessage();
        }
        return response;
    }

    @Override
    public void join(int idTransaction) {
          if(this.idTransaction == idTransaction){
            this.prestamo.beginTransaction();
        }
    }

    @Override
    public void commit(int idTransaction) {
       if(this.idTransaction == idTransaction){
            this.prestamo.commit();
        }
    }

    @Override
    public void cancel(int idTransaction) {
        if(this.idTransaction == idTransaction){
            this.prestamo.rollBack();
        }
    }
}
