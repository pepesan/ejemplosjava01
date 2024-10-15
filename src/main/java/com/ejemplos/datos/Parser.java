package com.ejemplos.datos;

public class Parser {
    public static void main(String[] args) {
        String s="25";
        int y=Integer.parseInt(s);
        System.out.println(y);
        short z=Short.parseShort(s);
        System.out.println(z);
        double c=Double.parseDouble(s);
        System.out.println(c);
        byte x=Byte.parseByte(s);
        System.out.println(x);
        s="2500";
        Integer a=Integer.valueOf(s);
        System.out.println(a);
        Short b=Short.valueOf(s);
        System.out.println(b);
        Double d=Double.valueOf(s);
        System.out.println(d);
    }
}
