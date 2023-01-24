package com.ejemplos.datos.complejos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Cliente implements Serializable{

    private String nombre;
    private String dni;
    private List<Direccion> direcciones;

    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.direcciones=new ArrayList<>();
    }
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.direcciones=new ArrayList<>();
    }
    public Cliente(String nombre, String dni, List<Direccion> direcciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.direcciones=direcciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (getNombre() != null ? !getNombre().equals(cliente.getNombre()) : cliente.getNombre() != null) return false;
        if (getDni() != null ? !getDni().equals(cliente.getDni()) : cliente.getDni() != null) return false;
        return getDirecciones() != null ? getDirecciones().equals(cliente.getDirecciones()) : cliente.getDirecciones() == null;

    }

    @Override
    public int hashCode() {
        int result = getNombre() != null ? getNombre().hashCode() : 0;
        result = 31 * result + (getDni() != null ? getDni().hashCode() : 0);
        result = 31 * result + (getDirecciones() != null ? getDirecciones().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
