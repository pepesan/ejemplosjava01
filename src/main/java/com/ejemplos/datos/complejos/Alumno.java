package com.ejemplos.datos.complejos;


import java.util.Date;

public class Alumno {
    public String nombre;
    public String apellidos;
    public Date fechaNacimiento;
    public Alumno(){
        this.nombre=new String("");
        this.apellidos="";
        this.fechaNacimiento= new Date();
    }
    public Alumno(String nombre, String apellidos, Date fechaNacimiento){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento= fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
