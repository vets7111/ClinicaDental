/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Conexion;
import Modelo.Odontologo;
import javax.swing.JComboBox;
import vistas.VentanaNuevoOdontologo;

/**
 *
 * @author User
 */
public class NuevoOdontologoController {
    public static VentanaNuevoOdontologo ventana= new VentanaNuevoOdontologo();
    public static void Mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
    public static void agregar(){
        String nombre = ventana.getJtxt_nombre().getText();
        String apellido = ventana.getJtxt_apellidos().getText();
        String ciudad = ventana.getJtxt_ciudad().getText();
        String correo = ventana.getJtxt_correo().getText();
        String direccion = ventana.getJtxt_direccion().getText();
        String provincia = ventana.getJtxt_provincia().getText();
        int celular = Integer.parseInt(ventana.getJtxt_celular().getText());
        int dni = Integer.parseInt(ventana.getJtxt_dnidentista().getText());
//        String turno = ventana.getJcbx_turno().getSelectedIndex();
//        String genero =
        Odontologo odont = new Odontologo();
        odont.setNombre(nombre);
        odont.setApellido(apellido);
        odont.setCiudad(ciudad);
        odont.setCorreo(correo);
        odont.setDireccion(direccion);
        odont.setProvincia(provincia);
        odont.setTelefono(celular);
        odont.setDni_odontologo(dni);
//        odont.setTurno(turno);
        Conexion conexion = new Conexion();
        conexion.agregarOdontologo(odont);
      
    }
    public static void Ocultar(){
        ventana.setVisible(false);
    }
}
