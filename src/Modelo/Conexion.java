/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Conexion {
     public static Connection getConexion(){
      String url= "jdbc:sqlserver://DESKTOP-JE6546L:1433;"
                +"database=BD_CLINICADENTAL;"
                +"user=sa;"
                +"password=esau;";
    try{
        Connection con=DriverManager.getConnection(url);
       
        System.out.println("CONEXION SATISFACTORIA:  "+con);
        return con;
    }catch(SQLException e){
        System.out.println("Principal"+e.toString());
        return null;
    }
    }
    
}
