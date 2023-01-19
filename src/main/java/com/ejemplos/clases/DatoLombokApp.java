package com.ejemplos.clases;

public class DatoLombokApp {
    public static void main(String[] args) {
        DatoLombok datoLombok = new DatoLombok();
        datoLombok.setAge(2);
        datoLombok.setName("David");
        System.out.println(datoLombok);
        datoLombok = new DatoLombok("David", 2);
        System.out.println(datoLombok);
    }
}
