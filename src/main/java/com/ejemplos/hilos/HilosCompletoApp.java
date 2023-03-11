package com.ejemplos.hilos;

import static com.ejemplos.hilos.HilosCompleto.threadMessage;

public class HilosCompletoApp {
    public static void main(String[] args) throws InterruptedException {
        //Delay, in milliseconds before we interrupt MessageLoop
        //thread (default one hour).
        long patience = 500 * 60 * 60;

        //If command line argument present, gives patience in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 500;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }

        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new HilosCompleto.MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        //loop until MessageLoop thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            //Wait maximum of 500 milisecond for MessageLoop thread to
            //finish.
            t.join(500);
            if (((System.currentTimeMillis() - startTime) > patience) &&
                    t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                //Shouldn't be long now -- wait indefinitely
                t.join();
            }

        }
        threadMessage("Finally!");
    }
}
