package com.ejemplos.ejercicios.clases;

public class PerroLombokApp {
    public static void main(String[] args) {
        PerroLombok toby = new PerroLombok();
        System.out.println("Raza de Toby: "+toby.getRaza());
        toby.setRaza("Terrier");
        PerroLombok otto = new PerroLombok();
        otto.setRaza("Pastor Alemán");
        System.out.println(toby.getRaza());
        System.out.println(otto.getRaza());
        PerroLombok fluky= new PerroLombok("Pastor de Aguas");
        fluky.setRaza("Pastor de Aguas");
        System.out.println(fluky.getRaza());
        fluky.setNombre("Fluky");
        System.out.println(fluky);
        if (otto.equals(fluky)){
            System.out.println("Son iguales");
            // no te lo crres ni tu!!
        }else {
            System.out.println("¿Cómo van a ser iguales, tu flipas?");
        }
    }
}
