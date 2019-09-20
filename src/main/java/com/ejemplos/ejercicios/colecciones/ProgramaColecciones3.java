package com.ejemplos.ejercicios.colecciones;

import java.util.*;

public class ProgramaColecciones3 {
    public static void main(String[] args) {
        Pieza3 pieza = new Pieza3(
                "Gigabyte X570 Gaming pro carbon chahiguay",
                "Plaza Base AMD");
        Ordenador3 ordenador = new Ordenador3();
        ordenador.setMarca("Aorus");
        ordenador.setModelo("Aero 15 AMD");
        ordenador.getPiezas().add(pieza);
        // ordenador.setPieza(pieza);
        System.out.println(ordenador.getPiezas().get(0).getNombre());
        Pieza3 p1= new Pieza3("Nombre 3","Tipo 2");
        Pieza3 p2= new Pieza3("Nombre 1","Tipo 3");
        Pieza3 p3= new Pieza3("Nombre 2","Tipo 4");
        Pieza3 p4= new Pieza3("Nombre 4","Tipo 1");
        Pieza3 p5= new Pieza3("Nombre 4","Tipo 1");
        Set<Pieza3> misPiezas= new HashSet<>();
        misPiezas.add(p1);
        misPiezas.add(p2);
        misPiezas.add(p3);
        misPiezas.add(p4);
        misPiezas.add(p5);
        System.out.println(misPiezas);
        SortedSet<Pieza3> piezasOrdenadas =
                // new TreeSet<>(Comparator.comparing(Pieza3::getNombre));
                new TreeSet<>();
        piezasOrdenadas.add(p1);
        piezasOrdenadas.add(p2);
        piezasOrdenadas.add(p3);
        piezasOrdenadas.add(p4);
        System.out.println(piezasOrdenadas);
        Map cliente = new HashMap<String, String>();
        cliente.put("nombre","pepe");
        cliente.put("direccion", "mi calle");
        cliente.put("tlf","677665+234");
        cliente.put("email","p@p.com");
        System.out.println(cliente);
        List<Map<String,String>> listadoDeMapas = new ArrayList<>();
        listadoDeMapas.add(cliente);
        listadoDeMapas.add(cliente);
        System.out.println(listadoDeMapas);
    }
}
