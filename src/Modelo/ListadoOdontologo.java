/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Antony
 */
public class ListadoOdontologo {
    ArrayList<Odontologo>lista;
    public ListadoOdontologo(){
        lista = new ArrayList<>();
    }
    public void AgregarOdontologo(Odontologo o){
        lista.add(o);
        
    }
}   

