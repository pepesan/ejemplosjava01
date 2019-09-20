package com.ejemplos.ejercicios.colecciones;

import java.util.Objects;

public class Pieza3 implements Comparable<Pieza3>{
    private String nombre;
    private String tipoDePieza;

    public Pieza3() {
        this.nombre = "";
        this.tipoDePieza = "";
    }

    public Pieza3(String nombre, String tipoDePieza) {
        this.nombre = nombre;
        this.tipoDePieza = tipoDePieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePieza() {
        return tipoDePieza;
    }

    public void setTipoDePieza(String tipoDePieza) {
        this.tipoDePieza = tipoDePieza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza3 pieza3 = (Pieza3) o;
        return Objects.equals(nombre, pieza3.nombre) &&
                Objects.equals(tipoDePieza, pieza3.tipoDePieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoDePieza);
    }

    @Override
    public String toString() {
        return "Pieza3{" +
                "nombre='" + nombre + '\'' +
                ", tipoDePieza='" + tipoDePieza + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pieza3 o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
