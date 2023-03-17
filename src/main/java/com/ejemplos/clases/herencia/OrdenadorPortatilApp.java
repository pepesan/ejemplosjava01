package com.ejemplos.clases.herencia;

public class OrdenadorPortatilApp {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        ordenador.setCpu("AMD 7600X");
        ordenador.setMemoria(16);
        ordenador.setHdd(2);
        System.out.println(ordenador);
        OrdenadorPortatil portatil = new OrdenadorPortatil();
        System.out.println(portatil);
        portatil = new OrdenadorPortatil("AMD 7950X", 32, 2, 99.99);
        System.out.println(portatil);
        OrdenadorPortatil portatil2 = new OrdenadorPortatil("AMD 7950X", 32, 2, 99.99);
        if (portatil.equals(portatil2)){
            System.out.println("Ambos objetos son iguales");
        }
    }
}
