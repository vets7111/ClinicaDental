/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VentanaNuevoOdontologo;

/**
 *
 * @author Antony
 */
public class RegistrarPersonalController {
    
    public static VentanaNuevoOdontologo ventana= new VentanaNuevoOdontologo();
    public static void Mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
}
