package com.ejemplos.ejercicios.colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ordenador implements Serializable {
    private String marca;
    private String modelo;
    private Set<Pieza> piezas;
    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.piezas = new HashSet<>();
    }

    public Ordenador(String marca, String modelo, Set<Pieza> piezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(Set<Pieza> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", piezas=" + piezas +
                '}';
    }
}
