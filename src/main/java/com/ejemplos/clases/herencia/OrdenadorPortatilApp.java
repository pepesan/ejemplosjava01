package com.ejemplos.clases.herencia;

public class OrdenadorPortatilApp {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        ordenador.setCpu("AMD 7600X");
        ordenador.setMemoria(16);
        ordenador.setHdd(2);
        System.out.println(ordenador);
        Portatil portatil = new Portatil();
        System.out.println(portatil);
        portatil = new Portatil("AMD 7950X", 32, 2, 99.99);
        System.out.println(portatil);
        Portatil portatil2 = new Portatil("AMD 7950X", 32, 2, 99.99);
        if (portatil.equals(portatil2)){
            System.out.println("Ambos objetos son iguales");
        }
    }
}
