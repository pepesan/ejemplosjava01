package com.ejemplos.hilos;

public class Hilos extends Thread {
    public Hilos(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10 ; i++){
        	try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }
}
