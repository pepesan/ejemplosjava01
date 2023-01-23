package com.ejemplos.clases.abstractas;

public class PistolaApp {
    public static void main(String[] args) {
        Pistola pistola = new Pistola();
        System.out.println(pistola.getSerialVersionUID());
        Pistola pistola2 = new Pistola();
        System.out.println(pistola2.getSerialVersionUID());
        System.out.println(Math.PI);
    }
}
