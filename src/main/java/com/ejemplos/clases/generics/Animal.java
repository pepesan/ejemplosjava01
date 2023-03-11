package com.ejemplos.clases.generics;

/**
 * Created by pepesan on 28/04/2016.
 */
public class Animal {
    public String color;
    protected String raza;
    public Float peso;
    public Float altura;
    public String nombre;
    public Animal(){
        this.color="";
        this.altura=0.0f;
        this.raza="";
        this.peso=0.0f;
        this.nombre="";
    }
    public Animal(String color, String raza,
                  Float peso, Float altura,
                  String nombre){
        this.color=color;
        this.altura=altura;
        this.raza=raza;
        this.peso=peso;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
