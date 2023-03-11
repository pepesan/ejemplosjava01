package com.ejemplos.hilos;

public class Hilos2App {
    public static void main(String[] args) {
        new Thread ( new Hilos2() , "Pepe").start();
        new Thread ( new Hilos2() , "Juan").start();
        new Thread ( new Hilos2() , "Pedro").start();
        new Thread ( new Hilos2() , "Pablo").start();
        new Thread ( new Hilos2() , "Albert").start();
        new Thread ( new Hilos2() , "Mariano").start();
        new Thread ( new Hilos2() , "Rosa").start();
        new Thread ( new Hilos2() , "Alberto").start();
        new Thread ( new Hilos2() , "Françecs").start();
        System.out.println("Termina thread main");
    }
}
