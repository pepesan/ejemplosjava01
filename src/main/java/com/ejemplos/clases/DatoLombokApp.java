package com.ejemplos.clases;

public class DatoLombokApp {
    public static void main(String[] args) {
        DatoLombok datoLombok = new DatoLombok();
        System.out.println(datoLombok);
        datoLombok.setAge(2);
        System.out.println(datoLombok.getAge());
        datoLombok.setName("David");
        System.out.println(datoLombok.getName());
        System.out.println(datoLombok);
        datoLombok = new DatoLombok("David", 2);
        System.out.println(datoLombok);
    }
}
