package com.ejemplos.datos.complejos;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nombre;
    private Set<Libro> librosEscritos;

    public Autor() {
        this.nombre = "";
        this.librosEscritos = new HashSet<Libro>();
    }

    public Autor(String nombre, Set<Libro> librosEscritos) {
        this.nombre = nombre;
        this.librosEscritos = librosEscritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(Set<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", librosEscritos=" + librosEscritos +
                '}';
    }
}
