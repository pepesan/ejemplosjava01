package com.ejemplos.ejercicios.optionals;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EjercicioOptionals {
    public static void main(String[] args) {
        DoubleStream.of(1.0, 2.0, 3.0
                        ,4.0
                )
                .filter(d -> d>=4.0)
                .findFirst()
                .ifPresentOrElse(
                        // caso bueno
                        System.out::println,
                        // caso malo
                        () -> {
                            System.out.println("No hay mayor que 4.0");
                        });
    }
}
