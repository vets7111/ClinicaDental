/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import vistas.VentanaLogin;
import Modelo1.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vistas.VentanaNuevoUsuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Antony
 */
///soy ajck
public class LoginController {
    
    
    public static VentanaLogin ventana= new VentanaLogin();
    public static VentanaNuevoUsuario regpersonal = new VentanaNuevoUsuario();
   
    public static void Mostrar(){
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
    
    public static void bontonSalir(){
        System.exit(0);
    }
       private static String encriptarContraseña(String contraseña) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contraseña.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void eventJlabel3(){
//     
        String Usuario = ventana.getjTextField1().getText();
        String Contraseña= ventana.getjPasswordField1().getText();
        String contraseñaEncriptada = encriptarContraseña(Contraseña);
        try {
         Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement("SELECT*FROM USUARIOS Where usuario= ?  and Contrasena=?");
         ps.setString(1,Usuario);
         ps.setString(2,contraseñaEncriptada);
         ResultSet rs = ps.executeQuery();
         
         if(rs.next()){
             
           new PrincipalController().Mostrar();
           //dispose();
           Ocultar();
         } else{
           JOptionPane.showMessageDialog(null,"Intente De Nuevo");
         }
        } catch(SQLException e){
         JOptionPane.showMessageDialog(null,e.toString());
       } 
        
       ventana.getjTextField1().setText("");
       ventana.getjPasswordField1().setText("");
    } 
    }
    
    
    

