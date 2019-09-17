package com.ejemplos.ejercicios;

public class Estructuras {
    public static void main(String[] args) {
        int i =0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<10);
        for (i=0;i<10;i++){
            System.out.println(i);
        }
        int edad = 10;
        if (edad>=18){
            System.out.println("Puede conducir");
        }else {
            System.out.println("No puede conducir");
        }
        edad = 20;
        switch (edad){
            case 18:
                System.out.println("Puede conducir");
                break;
            case 21:
                System.out.println("Puede beber en USA, jajaja, pringao");
                break;
            default:
                System.out.println(edad);
        }
        i =0;
        while (i<10){

            if (i==5){
                break;
            }
            if (i==2){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
