/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador; 

import Modelo.Conexion;





/**
 *
 * @author Antony
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PrincipalController.Mostrar();
        LoginController.Mostrar();
//        Conexion conexion = new Conexion();
        Modelo.Conexion.getConexion();
        

        
        
        
    }
    
    
}
