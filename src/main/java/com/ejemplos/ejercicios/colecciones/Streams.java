package com.ejemplos.ejercicios.colecciones;

import com.ejemplos.datos.complejos.Persona;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // Dado un array de enteros, devolver los números pares (filter)
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        numeros
            .stream()
            .filter( i -> i % 2 == 0) // Stream<Integer> (filtrado)
            .forEach(System.out::println);
        // Dada una lista de strings, convertir todos los elementos a mayúsculas (map)
        List<String> listado = List.of("uno", "dos");
        listado
            .stream()
            // convierte cada uno de los elementos a mayúsculas mediante el método de String toUpperCase
            .map(
                    // (String s) -> {return s.toUpperCase();}
                    String::toUpperCase
            )
            .forEach(System.out::println);
        // Dado un array de enteros, devuelve el valor máximo (reduce)
        numeros = Arrays.asList(6,2,3,4,5,1);
        Integer resultado = numeros
                .stream()
                .reduce(
                // valor inicial
                Integer.MIN_VALUE,
                // funcion del reduce
                (acc, cur) -> acc.compareTo(cur) > 0 ? acc : cur
        );
        System.out.println("Max value: "+resultado);

        //Dado un array de objetos de tipo Persona,
        // filtrar aquellos cuya edad sea mayor a 18 y
        // devolver una lista con sus nombres (filter y map)
        List<Persona> personas = List.of(
                new Persona(12, "Ana"),
                new Persona(18, "Pepe"),
                new Persona(25, "Sofía")
                );
        personas.stream()
                // devuelve el elemento que cumpla con la condición devuelta
                .filter(p -> p.getEdad()>= 18)
                // devolver en vez de la persona entera, sólo el nombre de la persona
                .map(Persona::getNombre)
                .forEach(System.out::println);
        // Dado un array de Strings, conviértelos a enteros y devuelve la suma de los mismos.
        List<String> numerosCadena = List.of("1", "2", "3");
        resultado = numerosCadena.stream()
                .map(Integer::parseInt)
                .reduce(0,
                        Integer::sum);
        System.out.println("Suma : "+ resultado);

        // Dado un array de Strings, filtra las palabras que tienen más de 5 letras
        // y devuelve un listado con las mismas.
        List<String> listadoPalabras = List.of("Uno", "Cuarenta", "Preving");
        listadoPalabras.stream().filter(s -> s.length()>=5).forEach(System.out::println);
        // Supongamos que tenemos una lista de listas de enteros y queremos obtener una lista plana con todos los números
        List<Integer> primerListado = List.of(1,2);
        List<Integer> segundoListado = List.of(3,4);
        List<List<Integer>> listadoDeListados = List.of(primerListado, segundoListado);
        listadoDeListados.stream().flatMap(Collection::stream).forEach(System.out::println);
        
        

        /*
        int[] nums = {5, 20, 12, 8, 30};
        int result = Arrays.stream(nums)
                .filter(n -> n > 10)
                .sum();
        System.out.println(result);

        String[] palabras = {"azul", "amarillo", "blanco", "anaranjado", "verde"};
        List<String> resultados = Arrays.stream(palabras)
                .filter(p -> p.startsWith("a"))
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(resultados);

         */
    }
}
