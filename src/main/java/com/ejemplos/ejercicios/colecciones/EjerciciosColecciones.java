package com.ejemplos.ejercicios.colecciones;

import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        // Declara e inicializa un listado de Strings
        List<String> listado = new LinkedList<>();
        // Añade dos elementos
        listado.add("Uno");
        listado.add("Dos");
        // Imprime por pantalla el primer elemento
        System.out.println(listado.get(0));
        // Recorre el listado con un foreach
        for (String s: listado) {
            // imprime cada uno de los elementos
            System.out.println(s);
        }
        listado.remove(1);
        // Intenta acceder al elemento eliminado
        try{
            System.out.println(listado.get(1));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Listado de un elemento: " + listado);
        }
        // Comprobar que el elemento no está presente
        if (listado.contains("Dos")){
            System.out.println("El elemento está presente");
        }else {
            System.out.println("El elemento NO está presente");
        }
        // Comprobar que sólo hay un elemento en el listado
        if (listado.size()==1){
            System.out.println("El listado sólo tiene un elemento");
        }
        // Declara e inicializa un conjunto de elementos de tipo Integer
        Set<Integer> numeros = new HashSet<Integer>();
        // mete dos números en el conjunto
        numeros.add(1);
        numeros.add(2);
        // recorre el conjunto
        for (Integer i: numeros) {
            // imprime por pantalla
            System.out.println(i);
        }
        // Declara un mapa de clave Integer y Valor String
        Map<Integer, String> mapa = new HashMap<>();
        // mete dos valores con sus respecitvas claves en el mapa
        mapa.put(1,"Uno");
        mapa.put(2,"Dos");
        // imprime el primer valor por pantalla
        System.out.println(mapa.get(1));
        // Obtengo el conjunto de claves del mapa
        Set<Integer> claves = mapa.keySet();
        // Recorro el conjunto de claves
        for (Integer i: claves) {
            // Imprimo por pantalla el valor de cada clave
            System.out.println("Clave " + i + ": " + mapa.get(i));
        }
        // Recojo los valores
        Collection<String> coleccionValores = mapa.values();
        // Recorro los valores
        for (String s: coleccionValores) {
            // Impimo cada valor
            System.out.println(s);
        }
        // Creo un objeto de Actor
        Actor actor = new Actor();
        actor.setNombre("Javier Bardem");
        actor.setGeneroFavorito("Drama");
        actor.setAgnosExperiencia(32);
        // Creo una actriz
        Actor actriz = new Actor();
        actriz.setNombre("Penélope Cruz");
        actriz.setGeneroFavorito("Drama");
        actriz.setAgnosExperiencia(27);
        // Declaro e inicializo un listado de actores
        List<Actor> listadoActores = new ArrayList<>();
        listadoActores.add(actor);
        listadoActores.add(actriz);
        // Creo un objeto de la serie
        Serie serie = new Serie();
        // definimos los atributos básicos
        serie.setTitulo("Mr. & Ms. Rojeras");
        serie.setGenero("Comedia");
        serie.setAgnoPublicacion(2035);
        // Asignar el reparto
        serie.setReparto(listadoActores);
        // imprimimos el objeto de la serie
        System.out.println(serie);
    }
}
