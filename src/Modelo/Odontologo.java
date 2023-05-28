/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;


/**
 *
 * @author Antony
 */
public class Odontologo {
    private int dni_odontologo;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private String turno;
    private String genero;
    private String provincia;
    private String direccion;
    private LocalDate fecha_nacimient;
    private String ciudad;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Odontologo{");
        sb.append("dni_odontologo=").append(dni_odontologo);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append(", turno=").append(turno);
        sb.append(", genero=").append(genero);
        sb.append(", provincia=").append(provincia);
        sb.append(", direccion=").append(direccion);
        sb.append(", fecha_nacimient=").append(fecha_nacimient);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }

    public Odontologo() {
    }

    public Odontologo(int dni_odontologo, String nombre, String apellido, int telefono, String correo, String turno, String genero, String provincia, String direccion, LocalDate fecha_nacimient, String ciudad) {
        this.dni_odontologo = dni_odontologo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.turno = turno;
        this.genero = genero;
        this.provincia = provincia;
        this.direccion = direccion;
        this.fecha_nacimient = fecha_nacimient;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDni_odontologo() {
        return dni_odontologo;
    }

    public void setDni_odontologo(int dni_odontologo) {
        this.dni_odontologo = dni_odontologo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_nacimient() {
        return fecha_nacimient;
    }

    public void setFecha_nacimient(LocalDate fecha_nacimient) {
        this.fecha_nacimient = fecha_nacimient;
    }
    
    
    
}
