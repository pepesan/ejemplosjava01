package com.ejemplos.clases;


public class CocheApp {
    public static void main(String[] args) {
        Coche auris = new Coche();
        System.out.println(auris);
        auris.setMatricula("SA1234M");
        System.out.println(auris.getMatricula());
        auris.setNumRuedas(5);
        System.out.println(auris.getNumRuedas());
        System.out.println(auris);
        Coche auris2 = new Coche("SA1234M", 5);
        if (auris.equals(auris2)) {
            System.out.println("Ambos coches son iguales");
        }
    }
}
