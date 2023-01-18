package com.ejemplos.clases;

import static com.ejemplos.clases.ClaseConstructora.newInstance;

public class ClaseConstructoraApp {
    public static void main(String[] args) {
        ClaseConstructora objetoConstruido = new ClaseConstructora();
        System.out.println(objetoConstruido);
        System.out.println(objetoConstruido.nombre);
        System.out.println(objetoConstruido.apellidos);
        objetoConstruido = new ClaseConstructora("David", "Vaquero");
        System.out.println(objetoConstruido);
        System.out.println(objetoConstruido.nombre);
        System.out.println(objetoConstruido.apellidos);
        objetoConstruido = new ClaseConstructora("David");
        System.out.println(objetoConstruido);
        System.out.println(objetoConstruido.nombre);
        System.out.println(objetoConstruido.apellidos);
        objetoConstruido = ClaseConstructora.newInstance();
        System.out.println(objetoConstruido);
        System.out.println(objetoConstruido.nombre);
        System.out.println(objetoConstruido.apellidos);
        objetoConstruido = newInstance();
        System.out.println(objetoConstruido);
        System.out.println(objetoConstruido.nombre);
        System.out.println(objetoConstruido.apellidos);
    }
}
