
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.sql.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
    private static ConectionSingleton Conexion;
    public String RegistroEstudiante;
    public Date FechaInicio;
    public Date FechaFin;
    
    public Prestamo(){}
    
    public Prestamo(int IdPrestamo,String RegistroEstudiante, Date FechaInicio,Date FechaFin){
        this.RegistroEstudiante=RegistroEstudiante;
        this.FechaInicio=FechaInicio;
        this.FechaFin=FechaFin;
    }
      
    public void rollBack(){
        try{
            this.Conexion.getConection().rollback();
        }catch(SQLException e){
            System.out.println("Error Prestamo rollback");
        }
    }
    
    public void commit(){
        try{
            this.Conexion.getConection().commit();
        }catch(SQLException e){
            System.out.println("Error Prestamo Comit");
            System.out.println(e);
        }
    }
    
    public void beginTransaction(){
        try{
            this.Conexion.getInstance();
            this.Conexion.getConection().setAutoCommit(false);
        }catch(SQLException e){
            System.out.println("Error Prestamo beginTransaction");
            System.out.println(e);
        }
    }   
    
     public int save() throws SQLException{
            Conexion = ConectionSingleton.getInstance();
            PreparedStatement query = Conexion.getConection().prepareStatement("INSERT INTO prestamo(RegistroEstudiante,FechaInicio,FechaFin,Cantidad) VALUES (?,?,?,0)");
            //query.setInt(1, this.IdPrestamo);
            query.setString(1, this.RegistroEstudiante);              
            long d=  this.FechaInicio.getTime();
            query.setDate(2, new java.sql.Date(d));
            d=  this.FechaFin.getTime();
            query.setDate(3, new java.sql.Date(d));
            query.executeUpdate();   
            
           query = Conexion.getConection().prepareStatement("select last_insert_id()"); 
           ResultSet rs= query.executeQuery();
           int id=0;
            while (rs.next()) {
                id=rs.getInt(1);
            }
            return id;
    }
     
    public void update_quantity(int idPrestamo) throws SQLException{
            Conexion = ConectionSingleton.getInstance();
            PreparedStatement query = Conexion.getConection().prepareStatement("UPDATE Prestamo\n" +
                                                                               "set cantidad=ifnull((select count(dp.IdPrestamo) from detalle_prestamo as dp where dp.IdPrestamo=?),0)\n" +
                                                                               "where idPrestamo=?;");
            query.setInt(1, idPrestamo);    
            query.setInt(2, idPrestamo);           
            query.executeUpdate();   
    }
     
}

