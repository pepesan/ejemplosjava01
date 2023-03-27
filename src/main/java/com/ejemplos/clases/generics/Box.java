package com.ejemplos.clases.generics;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Box<T> {

    private T dato;

    public void setDato(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

}
