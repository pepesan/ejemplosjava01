package com.ejemplos.ejercicios.colecciones;

import java.util.HashSet;
import java.util.Set;

public class ProgramaColecciones2 {
    public static void main(String[] args) {
        Pieza2 p = new Pieza2("Teclado GAMING EXTREME RAZOR CHACHIGUAY EDITION", "Teclado");

        Ordenador2 o = new Ordenador2();
        o.setMarca("Dell");
        o.setModelo("Latitude");
        Set<Pieza2> listado = new HashSet<Pieza2>();
        for ( int i =0;i<4;i++){
            p= new Pieza2("Pieza", "Tipo "+i);
            listado.add(p);
        }

        o.setPiezas(listado);
        System.out.println(o);
        p = new Pieza2("Pieza", "Tipo "+1);
        o.getPiezas().add(p);
        System.out.println(o);

    }
}
