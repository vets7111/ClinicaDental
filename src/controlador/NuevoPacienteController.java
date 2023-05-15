/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VentanaNuevaConsulta;
import vistas.VentanaNuevoPaciente;

/**
 *
 * @author User
 */
public class NuevoPacienteController {
    public static VentanaNuevoPaciente ventana= new VentanaNuevoPaciente();
    public static void Mostrar(){
        
        ventana.setVisible(true);
        
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
}
