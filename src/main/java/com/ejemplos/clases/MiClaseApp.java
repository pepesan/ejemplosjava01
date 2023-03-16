package com.ejemplos.clases;

public class MiClaseApp {
    public static void main(String[] args) {
        // Declara e iniciliza un objeto
        // constructora sin parámetros
        MiClase miClase = new MiClase();
        miClase.numAlumnos = 17;
        System.out.println(miClase.numAlumnos);
        System.out.println(miClase.getNombre());
        // constructora con un parámetro
        // declara otro objeto diferentes
        miClase = new MiClase(2);
        // constructora con dos parámetro
        miClase = new MiClase(2, "Esme");
        // Cualquier objeto es un Object
        // o podemos decir que hereda de Object
        Object objeto = (Object) miClase;

        // declarar otro objeto de la misma clase
        MiClase miClase2 = new MiClase(2,"Esme");

        if (miClase2 != miClase){
            System.out.println("las referencias apuntan a objetos " +
                    "diferentes");
        }
        if (miClase.equals(miClase2)){
            System.out.println("los objetos tienen los mismos valores");
        }

        String cadena = "hola";
        String cadena2 = "hola";
        if (cadena2.equals(cadena)){
            System.out.println("las referencias son iguales");
        }else {
            System.out.println("la referencias son distintas");
        }

    }
}
