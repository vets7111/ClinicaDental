/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VentanaUsuarios;

/**
 *
 * @author User
 */
public class UsuarioController {
    public static VentanaUsuarios ventana= new VentanaUsuarios();
    public static void Mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
}
