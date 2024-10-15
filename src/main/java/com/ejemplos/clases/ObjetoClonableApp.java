package com.ejemplos.clases;

public class ObjetoClonableApp {
    public static void main(String[] args) {
        ObjetoClonable obj = new ObjetoClonable();
        obj.setNombre("Clase");
        System.out.println(obj);
        ObjetoClonable obj2 = obj.clone();
        System.out.println(obj2);
        // modificamos el objeto original
        obj.setNombre("Clase2");
        System.out.println(obj2);
    }
}
