package com.ejemplos.clases;

public class MiClaseUsaApp {
    public static void main(String[] args) {
        MiClase miObjeto;
        miObjeto=new MiClase();
        System.out.println(miObjeto);
        miObjeto.numAlumnos = 8;
        System.out.println(miObjeto.numAlumnos);
        // No es posible asignarlo, es privado
        // miobjeto.nombre= "Carl Marx";
        miObjeto.setNombre("Carl Marx");
        System.out.println(miObjeto.getNombre());

        MiClase otroObjeto= new MiClase();
        otroObjeto.setNombre("Unamuno");
        otroObjeto.numAlumnos = 4;

        MiClase otroOtroObjeto = new MiClase();
        System.out.println("Valor de Objeto: "+ otroOtroObjeto.numAlumnos);

        otroObjeto = new MiClase(2);
        otroObjeto = new MiClase(2,"Machado");
        System.out.println(otroObjeto);
        otroOtroObjeto = new MiClase(6, "Gloria Fuertes");
        System.out.println(otroOtroObjeto);
    }
}
