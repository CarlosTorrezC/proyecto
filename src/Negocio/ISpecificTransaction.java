
package Negocio;

import Datos.DetallePrestamo;
import Datos.Prestamo;
import java.util.ArrayList;

public interface ISpecificTransaction extends ITransactionParticipant{
    public String save(int idTransaction,Prestamo prestamo,ArrayList<DetallePrestamo> detalle);
}
