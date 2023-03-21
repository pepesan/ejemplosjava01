package com.ejemplos.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
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
    }
}
