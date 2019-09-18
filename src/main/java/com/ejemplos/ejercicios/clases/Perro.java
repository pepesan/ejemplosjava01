package com.ejemplos.ejercicios.clases;

import java.io.Serializable;
import java.util.Objects;

public class Perro implements Serializable {

    private String raza;
    private String nombre;

    public Perro() {
        this.raza = "";
        this.nombre = "";
    }

    public Perro(String raza) {
        this.raza = raza;
        this.nombre = "";
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza) &&
                Objects.equals(nombre, perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza, nombre);
    }
}
