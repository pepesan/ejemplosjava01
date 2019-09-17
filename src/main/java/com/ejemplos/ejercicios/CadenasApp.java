package com.ejemplos.ejercicios;

public class CadenasApp {
    public static void main(String[] args) {
        String saludo = "Hola";
        System.out.println(saludo.length());
        System.out.println(saludo.charAt(3));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf("l"));
        String cadena2= "";
        if (saludo.equals(cadena2)){
            // no te lo crees ni tu chavalote
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        // darle la vuelta a una cadena
        StringBuffer sf= new StringBuffer(saludo);
        System.out.println(sf.reverse());
        String cadena3= new String();
        for (int i=saludo.length()-1;i>=0;i--){
            cadena3+=saludo.charAt(i);
        }
        System.out.println(cadena3);
    }
}
