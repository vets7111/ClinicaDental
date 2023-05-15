/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import vistas.VentanaPrincipal;


/**
 *
 * @author Antony
 */
public class PrincipalController {
    
    public static VentanaPrincipal ventana= new VentanaPrincipal();
    public static void Mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
    
    public static void botonSalir(){
        Ocultar();
        LoginController.Mostrar();
        
    }
    public static void botonUsuario(){
        Ocultar();
        UsuarioController.Mostrar();
    }
    public static void botonConsultas(){
        Ocultar();
        ConsultasController.Mostrar();
    }
    public static void botonNuevaConsulta(){
        Ocultar();
        NuevaConsultaController.Mostrar();
    }
    
    public static void botonNuevoUsuario(){
        Ocultar();
        NuevoUsuarioController.Mostrar();
    }
    
    public static void botonRegistrarPersonal(){
        Ocultar();
        RegistrarPersonalController.Mostrar();
    }
    public static void botonConsultorio(){
        Ocultar();
        ConsultorioController.Mostrar();
    
       
    }
    public static void botonNuevoConsultorio(){
        Ocultar();
        NuevoConsultorioController.Mostrar();
    }
    
    public static void botonPaciente(){
        Ocultar();
        PacienteController.Mostrar();
    }
    public static void botonNuevoPaciente(){
        Ocultar();
        NuevoPacienteController.Mostrar();
    }
    public static void botonOdontologo(){
        Ocultar();
        OdontologoController.Mostrar();
    }
    public static void botonNuevoOdontologo(){
        Ocultar();
        NuevoOdontologoController.Mostrar();
    }
    
    public static void Tratamiento(){
        
    }

    public static void Reportes(){
        
    }
   
    
}
