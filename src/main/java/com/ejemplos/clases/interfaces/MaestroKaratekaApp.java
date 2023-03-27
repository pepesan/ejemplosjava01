package com.ejemplos.clases.interfaces;

public class MaestroKaratekaApp {
    public static void main(String[] args) {
        Luchador luchador = new MaestroKarateka();
        luchador.pugnetazo();
        luchador.patada();
        Sensei sensei = new MaestroKarateka();
        sensei.ensegnar("Zen");
        sensei.darquepensar();
        // casting
        MaestroKarateka maestroKarateka = new MaestroKarateka();
        luchador = (Luchador) maestroKarateka;
        luchador.pugnetazo();
        luchador.patada();
        sensei = (Sensei) maestroKarateka;
        sensei.ensegnar("Zen");
        sensei.darquepensar();
     }

}
