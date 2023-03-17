package com.ejemplos.clases.herencia;

public class AppVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        System.out.println(v);
        Moto m = new Moto();
        System.out.println(m);
        v = new Moto();
        // se puede gestionar un objeto aunque se inicialice con otra
        // si el objeto hereda de la otra
        System.out.println(v);
        m= new Moto(true);
        System.out.println(m);
        m = new Moto(0.0F, true);
        System.out.println(m);

        m.setVelocidad(20.0F);
        System.out.println(m.getVelocidad());
        m.setHaceCaballito(true);
        System.out.println(m.getHaceCaballito());
        Moto m2 = new Moto(20.0F, true);
        System.out.println(m);
        System.out.println(m2);
        if (m.equals(m2)){
            System.out.println("los objetos son iguales");
        }
    }
}
