package com.ejemplos.datos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Modificaciones {
    public static int incrementaVariable(int i, int incremento){
        i++;
        return i+incremento;
    }
    public static Integer incrementaInteger(Integer i, int incremento){
        i++;
        System.out.println("I: "+i);
        return i+incremento;
    }
    public static void cambiaListado(List<Integer> listado){
        listado.add(1);
    }
    public static void main(String[] args) {
        int i= 2;
        int j=0;
        j= incrementaVariable(i,2);
        System.out.println(j);
        System.out.println(i);
        Integer k=0;
        Integer l=0;
        l=incrementaInteger(k,2);
        System.out.println("L: "+l);
        System.out.println("K: "+k);
        // si estoy tirando de datos fijos
        List<Integer> listado;
        if(true){
            listado = new ArrayList<>();
        }else{
            listado= new LinkedList<>();
        }

        System.out.println(listado);
        cambiaListado(listado);
        System.out.println(listado);
        listado.add(3);
    }
}
