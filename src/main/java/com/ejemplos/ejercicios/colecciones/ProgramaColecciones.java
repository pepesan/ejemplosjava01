package com.ejemplos.ejercicios.colecciones;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza p = new Pieza("Teclado GAMING EXTREME RAZOR CHACHIGUAY EDITION", "Teclado");

        Ordenador o = new Ordenador();
        o.setMarca("Dell");
        o.setModelo("Latitude");
        Set<Pieza> listado = new HashSet<Pieza>();
        for ( int i =0;i<4;i++){
            p= new Pieza("Pieza", "Tipo "+i);
            listado.add(p);
        }
        o.setPiezas(listado);
        List<Pieza> listadoPieza= new ArrayList<>(listado);
        listadoPieza.sort(Comparator.comparing(Pieza::toString));
        System.out.println(o);
        p = new Pieza("Pieza", "Tipo "+1);
        o.getPiezas().add(p);
        System.out.println(o);

        Map<String,String> cliente = new HashMap<String, String>();
        cliente.put("nombre", "Pepe");
        cliente.put("direccion","Mi calle");
        cliente.put("tlf", "9123456678");
        cliente.put("email","p@p.com");
        System.out.println(cliente);
        List<Map<String,String>> listadoMapa=
                new ArrayList<Map<String, String>>();
        listadoMapa.add(cliente);
        System.out.println(listadoMapa);


























    }
}
