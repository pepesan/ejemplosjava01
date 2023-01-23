package com.ejemplos.clases.abstractas;

public class AbstractaApp {
    public static void main(String[] args) {
        // No puedo declarar objetos de una clase abstracta
        // Abstracta abstracta = new Abstracta();
        AbstractaImplementa abstractaImplementa = new AbstractaImplementa() ;
        abstractaImplementa.haceAlgo();
        abstractaImplementa.haceOtraCosa();
    }
}
