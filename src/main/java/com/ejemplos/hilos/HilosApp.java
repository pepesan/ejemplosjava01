package com.ejemplos.hilos;

public class HilosApp {
    public static void main(String[] args) {
        new Hilos("Pepe").start();
        new Hilos("Juan").start();
        System.out.println("Termina thread main");
    }
}
