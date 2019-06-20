package com.ejemplos.datos.complejos;

public class Libro {
    private String titulo;
    private Autor autor;

    public Libro() {
        this.titulo = "";
        this.autor = null;
    }

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo +"'"+
                '}';
    }
}
