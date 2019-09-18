package com.ejemplos.ejercicios.clases;

import java.io.Serializable;
import java.util.Objects;

public class Gato implements Serializable {
    private String nombre;
    private String raza;

    public Gato() {
        this.nombre = "";
        this.raza = "";
    }

    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nombre, gato.nombre) &&
                Objects.equals(raza, gato.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, raza);
    }
}
