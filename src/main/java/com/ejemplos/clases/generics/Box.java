package com.ejemplos.clases.generics;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
