/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author Javier
 */
public class Sucursal {
    private HashMap<String,Persona> Personas;
    private String Direccion;
    private String comuna;

    public HashMap<String,Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(HashMap<String,Persona> Personas) {
        this.Personas = Personas;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String Comuna) {
        this.comuna = comuna;
    }
    //Cambia la direccion de la persona pero en esta es de la misma comuna
    public void cambiarDireccion(String direccion) {
        this.setDireccion(direccion);
    }
    /*Cambia direccion de la persona fuera de 
      la comuna existente y se le asigna una nueva comuna*/
    public void cambiarDireccion(String direccion, String comuna) {
        this.setDireccion(direccion);
        this.setComuna(comuna);

    }

}
