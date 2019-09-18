package com.ejemplos.datos.complejos;

import static com.ejemplos.datos.complejos.Estatica.*;
public class EstaticaApp {
    public static void main(String[] args) {
        /*
        Estatica e= new Estatica();
        e.hazAlgo();
         */
        Estatica.hazAlgo();
        System.out.println(Math.random());
        System.out.println(Math.sqrt(4));
        System.out.println(Estatica.DIPUTADOS);
        System.out.println(DIPUTADOS);
        System.out.println(Math.PI);
        contador++;
        Estatica.contador++;
        System.out.println(contador);
    }
}
