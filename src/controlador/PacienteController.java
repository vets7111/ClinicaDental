/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VentanaPaciente;

/**
 *
 * @author Antony
 */
public class PacienteController {
    public static VentanaPaciente ventana= new VentanaPaciente();
    public static void Mostrar(){
        
        ventana.setVisible(true);
        
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
    
}
