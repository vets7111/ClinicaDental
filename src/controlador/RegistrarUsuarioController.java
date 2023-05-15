/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static java.awt.Frame.ICONIFIED;
import vistas.VentanaRegistrarUsuarios;

/**
 *
 * @author Antony
 */
public class RegistrarUsuarioController {
    public static VentanaRegistrarUsuarios ventana=new VentanaRegistrarUsuarios();
    
    public static void Mostrar(){
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
    
   public static void botonSalir(){
       
//       ventana.dispose();
       System.exit(0);
//       Ocultar();
//       PrincipalController.Mostrar();
   }
   public static void botonMinimizar(){
       ventana.setExtendedState(ICONIFIED);
   }
   
}
