
package Datos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetallePrestamo {
    private static ConectionSingleton Conexion;
    public int IdPrestamo;
    public int CodigoLibro;
    
     public DetallePrestamo(int CodigoLibro){
        this.IdPrestamo=0;
        this.CodigoLibro=CodigoLibro;
    }
       
    public DetallePrestamo(int IdPrestamo,int CodigoLibro){
        this.IdPrestamo=IdPrestamo;
        this.CodigoLibro=CodigoLibro;
    }
    
     public void save(int idPrestamo) throws SQLException{
            Conexion = ConectionSingleton.getInstance();
            PreparedStatement query = Conexion.getConection().prepareStatement("INSERT INTO detalle_prestamo(IdPrestamo,CodigoLibro) VALUES (?,?)");
            query.setInt(1, idPrestamo);
            query.setInt(2, this.CodigoLibro);         
            query.executeUpdate();             
    }
}
