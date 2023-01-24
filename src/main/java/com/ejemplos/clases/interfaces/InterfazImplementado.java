package com.ejemplos.clases.interfaces;

// Sólo con Java8 en adelante
public interface InterfazImplementado {
    public default void hazAlgo(){
        System.out.println("Algo");
    }
}
