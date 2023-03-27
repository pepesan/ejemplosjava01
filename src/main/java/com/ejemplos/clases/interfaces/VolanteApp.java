package com.ejemplos.clases.interfaces;

public class VolanteApp {
    public static void main(String[] args) {
        Volante volante = null;
        // necesito crear una clase  que implemente ese interfaz
        // VolanteIml
        // crear un objeto de la clase VolanteImpl
        volante = new VolanteImpl();
        volante.girarDerecha(20.0F);
        volante.girarIzquierda(10.0F);


        VolanteImpl volante1 = (VolanteImpl) volante;
        System.out.println(volante1.gradosActuales);

        volante = new VolanteImplAgresiva();
        volante.girarDerecha(20.0F);
        volante.girarIzquierda(10.0F);
        VolanteImplAgresiva volante2 = (VolanteImplAgresiva) volante;
        System.out.println(volante2.gradosActuales);
    }
}
