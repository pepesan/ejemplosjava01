package com.ejemplos.ficheros;

import java.io.*;

public class FicheroEscrituraApp {
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        File file = null;
        try{
            file = new File("./md5sum.txt");
            if(file.createNewFile()) {
                System.out.println("Success!");
            }else{
                System.out.println
                        ("Error, file already exists.");
            }
        }catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }
        BufferedWriter out=null;
        try {
            FileWriter fileWriter = new FileWriter("./md5sum.txt");
            out = new BufferedWriter(fileWriter);
            out.write("aString");
            out.close();
            System.out.println
                    ("File created successfully");
        }catch (IOException e) {
            System.out.println("Fallo al escribir el fichero");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Ejecutado en ambos casos try completo o catch");
        }
    }
}
