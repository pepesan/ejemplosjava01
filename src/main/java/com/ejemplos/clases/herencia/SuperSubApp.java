package com.ejemplos.clases.herencia;

public class SuperSubApp {
    public static void main(String[] args) {
        SuperClase superClase = new SuperClase();
        SubClase subClase = new SubClase();
        if (subClase instanceof SubClase){
            System.out.println("El objeto pertenece a la clase SubClase");
        }
        if (subClase instanceof SuperClase){
            System.out.println("El objeto pertenece a la clase SuperClase");
        }else {
            System.out.println("El objeto NO pertenece a la clase SuperClase");
        }
    }
}
