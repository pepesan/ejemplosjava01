package com.ejemplos.clases.herencia;

public class MadreHijaApp {
    public static void main(String[] args) {
        Madre madre = new Madre();
        madre.setName("Montse");
        System.out.println(madre.getName());
        Hija hija = new Hija();
        hija.setName("Teresa");
        System.out.println(hija.getName());

    }
}
