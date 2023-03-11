package com.ejemplos.hilos;

public class Hilos2 implements Runnable {
    public static int numero=0;
    public synchronized void inc(){
        numero++;
    }
    public void run() {
        for (int i = 0; i < 10 ; i++){
        	try {
				Thread.sleep(200);
                inc();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina thread " + Thread.currentThread().getName());
        System.out.println("Valor de numero: " + this.numero);
    }
}
