package com.ejemplos.ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FicheroEscrituraMultipleApp {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./md5sum.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++){

                pw.println("Linea " + i);
                System.out.println("Escrito: "+"Linea "+i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
