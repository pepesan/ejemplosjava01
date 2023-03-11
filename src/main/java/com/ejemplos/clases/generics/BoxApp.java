package com.ejemplos.clases.generics;

public class BoxApp {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(Integer.valueOf(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

        BoxExtends<Animal> boxExtends = new BoxExtends<>(new Animal());
        System.out.println(boxExtends);
    }
}
