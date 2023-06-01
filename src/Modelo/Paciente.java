/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


public class Paciente {
    private int dni_paciente;
    private int nro_historiaclinica;
    private String nombre;
    private String apellido;
    private Date fecha_apertura_historiaclinica;
    private String sexo;
    private int edad;
    private String lugar_nacimiento;
    private String grado_instruccion;
    private String ocupacion;
    private String estado_civil;
    private String lugar_procedencia;
    private String domicilio_actual;
    private String nombre_acompañante;
    private int antecedentes;

    public int getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(int dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public int getNro_historiaclinica() {
        return nro_historiaclinica;
    }

    public void setNro_historiaclinica(int nro_historiaclinica) {
        this.nro_historiaclinica = nro_historiaclinica;
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

    public Date getFecha_apertura_historiaclinica() {
        return fecha_apertura_historiaclinica;
    }

    public void setFecha_apertura_historiaclinica(Date fecha_apertura_historiaclinica) {
        this.fecha_apertura_historiaclinica = fecha_apertura_historiaclinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getGrado_instruccion() {
        return grado_instruccion;
    }

    public void setGrado_instruccion(String grado_instruccion) {
        this.grado_instruccion = grado_instruccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getLugar_procedencia() {
        return lugar_procedencia;
    }

    public void setLugar_procedencia(String lugar_procedencia) {
        this.lugar_procedencia = lugar_procedencia;
    }

    public String getDomicilio_actual() {
        return domicilio_actual;
    }

    public void setDomicilio_actual(String domicilio_actual) {
        this.domicilio_actual = domicilio_actual;
    }

    public String getNombre_acompañante() {
        return nombre_acompañante;
    }

    public void setNombre_acompañante(String nombre_acompañante) {
        this.nombre_acompañante = nombre_acompañante;
    }

    public int getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(int antecedentes) {
        this.antecedentes = antecedentes;
    }

    public Paciente(int dni_paciente, int nro_historiaclinica, String nombre, String apellido, Date fecha_apertura_historiaclinica, String sexo, int edad, String lugar_nacimiento, String grado_instruccion, String ocupacion, String estado_civil, String lugar_procedencia, String domicilio_actual, String nombre_acompañante, int antecedentes) {
        this.dni_paciente = dni_paciente;
        this.nro_historiaclinica = nro_historiaclinica;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_apertura_historiaclinica = fecha_apertura_historiaclinica;
        this.sexo = sexo;
        this.edad = edad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.grado_instruccion = grado_instruccion;
        this.ocupacion = ocupacion;
        this.estado_civil = estado_civil;
        this.lugar_procedencia = lugar_procedencia;
        this.domicilio_actual = domicilio_actual;
        this.nombre_acompañante = nombre_acompañante;
        this.antecedentes = antecedentes;
    }

    public Paciente(int dni_paciente, String nombre, String apellido) {
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Paciente() {
    }
    
}
