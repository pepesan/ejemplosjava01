package com.ejemplos.ejercicios;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] miarray = new int[4];
        miarray[0]=0;
        miarray[1]=0;
        miarray[2]=0;
        miarray[3]=0;
        int[] miarray2= {0,0,0,0};
        for (int i: miarray){
            System.out.println(i);
        }
        for (int i=0;i<miarray.length;i++){
            System.out.println(miarray[i]);
        }
        int i=0;
        while (i<miarray.length){
            System.out.println(miarray[i]);
            i++;
        }
        i=0;
        do{
            System.out.println(miarray[i]);
            i++;
        }while (i<miarray.length);
        float[] flotantes= new float  [2000];
        for (i =0;i<flotantes.length;i++){
            flotantes[i]=0;
        }
        // me parto XD
        for (i=0;i<1;i++){
            Arrays.fill(flotantes,0f);
        }
        flotantes[1]=7.3f;
        System.out.println(flotantes[1]);
        System.out.println(flotantes.length);
    }
}
