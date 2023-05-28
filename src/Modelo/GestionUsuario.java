/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

//este es el cambio de valqui
public class GestionUsuario {

    //Conexion con1 = new Conexion();

    public static ArrayList<Perfil> MostrarPerfil() {
        Connection con = Conexion.getConexion();
//        Statement stmt;
        ResultSet rs;
        var perfi=new ArrayList<Perfil>();
  
        try {
            PreparedStatement ps = con.prepareStatement("SELECT*FROM PERFILES");
            rs = ps.executeQuery();
            //jcbx_perfil.addItem("Seleccione Perfil");
              while(rs.next()){
              if(rs.getString("nombre_perfil")!=null){
                  perfi.add(new Perfil(rs.getInt("id_perfil"), rs.getString("nombre_perfil")));
              }
          
              }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

        return perfi;
    }

}
