/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo1;

import java.util.Date;

/////esto es un comentario
/**
 *
 * @author User
 */
public class Perfil {
    private int id_perfil;
    private String nombre_perfil;
    private Date fecha_registro_perfil;
    private Date fecha_modificacion_perfil;

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public Date getFecha_registro_perfil() {
        return fecha_registro_perfil;
    }

    public void setFecha_registro_perfil(Date fecha_registro_perfil) {
        this.fecha_registro_perfil = fecha_registro_perfil;
    }

    public Date getFecha_modificacion_perfil() {
        return fecha_modificacion_perfil;
    }

    public void setFecha_modificacion_perfil(Date fecha_modificacion_perfil) {
        this.fecha_modificacion_perfil = fecha_modificacion_perfil;
    }

    public Perfil(int id_perfil, String nombre_perfil, Date fecha_registro_perfil, Date fecha_modificacion_perfil) {
        this.id_perfil = id_perfil;
        this.nombre_perfil = nombre_perfil;
        this.fecha_registro_perfil = fecha_registro_perfil;
        this.fecha_modificacion_perfil = fecha_modificacion_perfil;
    }
    
    public Perfil(){
    }
     public Perfil(int id_perfil, String nombre_perfil){
         this.id_perfil = id_perfil;
        this.nombre_perfil = nombre_perfil;
    }
}
