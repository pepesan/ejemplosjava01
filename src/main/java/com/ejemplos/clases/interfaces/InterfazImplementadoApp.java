package com.ejemplos.clases.interfaces;

public class InterfazImplementadoApp {
    public static void main(String[] args) {
        InterfazImplementadoClase objeto = new InterfazImplementadoClase();
        objeto.hazAlgo();
        InterfazImplementado reimplementacion = new InterfazImplementadoRe();
        reimplementacion.hazAlgo();
    }
}
