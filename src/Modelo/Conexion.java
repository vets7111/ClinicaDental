/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author User
 */
public class Conexion {
//    Connection conexion;
//    String url= "jdbc:sqlserver://localhost:1433;"
//                +"database=BD_CLINICADENTAL;"
//                +"user=AntonySQL;"
//                +"password=root;"; 
//    public Conexion() {
//        try {
//            conexion = DriverManager.getConnection(url);
//        } catch (SQLException ex) {
//            
//        }
//        
//    }
     public static Connection getConexion(){
      String url= "jdbc:sqlserver://localhost:1433;"
                +"database=BD_CLINICADENTAL;"
                +"user=AntonySQL;"
                +"password=root;";
    try{
        Connection con=DriverManager.getConnection(url);
       
        System.out.println("CONEXION SATISFACTORIA:  "+con);
        return con;
    }catch(SQLException e){
        System.out.println("Principal"+e.toString());
        return null;
    }
    }
    
    public void agregarOdontologo(Odontologo odontologo){
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement s = con.prepareStatement("INSERT INTO ONDONTOLOGOS(dni_odontologo,nombre,apellido,telefono,correo,provincia,direccion,ciudad) VALUES(?,?,?,?,?,?,?,?)");
            s.setInt(1,odontologo.getDni_odontologo());
            s.setString(2,odontologo.getNombre());
            s.setString(3,odontologo.getApellido());
            s.setInt(4,odontologo.getTelefono());
            s.setString(5,odontologo.getCorreo());
            s.setString(6,odontologo.getProvincia());
            s.setString(7,odontologo.getDireccion());
            s.setString(8,odontologo.getCiudad());
            s.executeUpdate();
        } catch (Exception e) {
        }
    }
}
