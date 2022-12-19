
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionSingleton {
    private static final String driver = "com.mysql.jdbc.Driver"; 
    private static final String server = "jdbc:mysql://localhost:3306/proyecto_arquitectura";
    private static final String user = "root";
    private static final String password = "213125757";
    private static Connection conexion = null;

    private static ConectionSingleton INSTANCIA = null;
    
    private ConectionSingleton(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            System.out.println("Se ha registrado una nueva instancia");
        }catch(SQLException e){
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println("Error: " + e.toString());
        }
    }
    
    public static ConectionSingleton getInstance(){
        if(INSTANCIA == null){
            INSTANCIA = new ConectionSingleton();
        }
        return INSTANCIA;
    }
    
    public static Connection getConection() {
        return conexion;
    }
   
    
  
}
