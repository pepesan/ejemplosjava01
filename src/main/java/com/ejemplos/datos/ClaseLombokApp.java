package com.ejemplos.datos;

public class ClaseLombokApp {
    public static void main(String[] args) {
        ClaseLombok c= new ClaseLombok();
        c.setNombre("Pepe molón");
        System.out.println(c.getNombre());
        System.out.println(c.toString());
        ClaseLombok c2= new ClaseLombok();
        c2.setNombre("Pepe molón");
        if (c.equals(c2)){
            System.out.println("Los objetos son iguales");
        }
    }
}
