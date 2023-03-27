package com.ejemplos.clases.interfaces;

public class InterfazSimpleApp {
    public static void main(String[] args) {
        InterfazSimple interfazSimple = new InterfazSimple() {
            @Override
            public void hazAlgo() {

            }
        };
        // Crear un objeto basado en ese interfaz pero con una implementación concreta
        // de una clase concreta
        interfazSimple = new InterfazSimpleImpl();
        interfazSimple.hazAlgo();

    }
}
