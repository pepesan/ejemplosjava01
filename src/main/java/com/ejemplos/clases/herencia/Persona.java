package com.ejemplos.clases.herencia;

public class Persona {
    private Integer edad;
    private String nombre;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre) {
        this.edad = 0;
        this.nombre = nombre;
    }
    public Persona (Integer edad){
        this.nombre="";
        this.edad= edad;
    }

    public Persona(
            String nombre,
            Integer edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
