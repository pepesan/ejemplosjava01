package com.ejemplos.hilos.virtual;


import java.util.Random;
import java.util.concurrent.*;

public class App {
    public static class Ejecutable implements Runnable{

        @Override
        public void run() {
            System.out.println("llama a bbdd");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // hay que pasar al menos un parámetro para que cree hilos virtuales
        boolean vThreads = args.length > 0;
        System.out.println( "Using vThreads: " + vThreads);

        long start = System.currentTimeMillis();

        Random random = new Random();
        Runnable runnable = () -> { double i = random.nextDouble(1000) % random.nextDouble(1000);  };
        for (int i = 0; i < 50000; i++){
            if (vThreads){
                Thread.startVirtualThread(runnable);
            } else {
                Thread t = new Thread(runnable);
                t.start();
            }
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Run time: " + timeElapsed);

        // uso de ejecutores de hilos
        //ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(32);
        start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++){
            executor.submit(runnable);
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Run time: " + timeElapsed);

    }
}
