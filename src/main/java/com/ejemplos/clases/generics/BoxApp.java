package com.ejemplos.clases.generics;

public class BoxApp {
    public static void main(String[] args) {
        BoxInteger boxInteger = new BoxInteger(1);
        boxInteger.setDato(2);
        System.out.println(boxInteger.getDato());
        BoxFloat boxFloat = new BoxFloat(1.0F);
        boxFloat.setDato(2.0F);
        System.out.println(boxFloat.getDato());

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Box<Animal> animalBox = new Box<>();

        integerBox.setDato(Integer.valueOf(10));
        stringBox.setDato(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.getDato());
        System.out.printf("String Value :%s\n", stringBox.getDato());

        BoxExtends<Animal> boxExtends = new BoxExtends<>(new Animal());
        System.out.println(boxExtends);
    }
}
