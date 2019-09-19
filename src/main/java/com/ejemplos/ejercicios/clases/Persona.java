package com.ejemplos.ejercicios.clases;

import java.io.Serializable;

public class Persona
        implements Serializable {
    private String nombre;
    public Persona(){
        this.nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
