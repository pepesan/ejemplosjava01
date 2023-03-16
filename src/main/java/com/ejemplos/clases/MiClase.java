package com.ejemplos.clases;

import java.util.Objects;

public class MiClase{
    public Integer numAlumnos;
    private String nombre;

    public MiClase(){
        this.numAlumnos = 0;
        this.nombre = "";
    }

    public MiClase(Integer numAlumnos){
        this.numAlumnos = numAlumnos;
        this.nombre = "";
    }

    public MiClase(Integer numAlumnos, String nombre) {
        this.numAlumnos = numAlumnos;
        this.nombre = nombre;
    }

    public Integer getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(Integer numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "numAlumnos=" + this.numAlumnos +
                ", nombre='" + this.nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiClase miClase = (MiClase) o;
        return Objects.equals(numAlumnos, miClase.numAlumnos) && Objects.equals(nombre, miClase.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numAlumnos, nombre);
    }

    /*
    @Override
    public void finalize(){
        // código de liberación de memoria del objeto
        // Deprecado en JAVA 9
        // hay que usar por ejemplo Phantom References
        // https://docs.oracle.com/javase/9/docs/api/java/lang/ref/PhantomReference.html
        // ó https://www.baeldung.com/java-finalize usando los AutoCloseable
    }
     */
}
