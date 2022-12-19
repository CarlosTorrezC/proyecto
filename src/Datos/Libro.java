/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rmenacho
 */
public class Libro {
    private static ConectionSingleton Conexion;
   
    public Libro(){}
    
    public boolean validate_stock(int CodigoLibro) throws SQLException{
         Conexion = ConectionSingleton.getInstance();
         PreparedStatement query = Conexion.getConection().prepareCall("select stock from Libro where CodigoLibro=? limit 1 ");
         query.setInt(1, CodigoLibro);       
         ResultSet rs= query.executeQuery();
         int stock=0;
         while (rs.next()) {
            stock=rs.getInt(1);
         }
         return stock>0;
    }
    
    public void update(int CodigoLibro) throws SQLException{
            Conexion = ConectionSingleton.getInstance();
            PreparedStatement query = Conexion.getConection().prepareStatement("update libro set stock=(stock-1) where CodigoLibro=?");
            query.setInt(1, CodigoLibro);       
            query.executeUpdate();             
    }
}
