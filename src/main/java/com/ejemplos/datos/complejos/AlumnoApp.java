package com.ejemplos.datos.complejos;

import java.util.Date;

public class AlumnoApp {
    public static void main(String[] args) {
        Alumno alumnoRandom = new Alumno();
        alumnoRandom.nombre= "Javier";
        Alumno monica=new Alumno();
        monica.nombre="Mónica";
        System.out.println(monica.nombre);
        monica.apellidos="Nieto Castellanos";
        System.out.println(monica.apellidos);
        monica.fechaNacimiento=new Date();
        System.out.println(monica.fechaNacimiento);
        monica.fechaNacimiento= new Date(102,0,12);
        System.out.println(monica.fechaNacimiento);
        Alumno david = new Alumno("David", "Vaquero", new Date(78,5,30));
        System.out.println(david.nombre);
        System.out.println(david.apellidos);
        System.out.println(david.fechaNacimiento);
        System.out.println(david);
        // igual a System.out.println(david.toString());
    }
}
