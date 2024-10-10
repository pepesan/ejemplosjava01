package com.ejemplos.clases;

public class ClaseConstructora {
    public String nombre;
    public String apellidos;

    // define el código que se ejecuta cuando se construye un objeto de la clase
    public ClaseConstructora(){
        nombre = "David";
        apellidos = "Vaquero";
    }

    public ClaseConstructora(String nombre){
        this.nombre = nombre;
        this.apellidos = "";
    }

    public ClaseConstructora(String nombre,
                             String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static ClaseConstructora newInstance(){
        return new ClaseConstructora();
    }
}
