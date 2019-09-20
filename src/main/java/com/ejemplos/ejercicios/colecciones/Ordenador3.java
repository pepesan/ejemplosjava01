package com.ejemplos.ejercicios.colecciones;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Ordenador3 implements Serializable {
    private String marca;
    private String modelo;
    private List<Pieza3> piezas;

    public Ordenador3() {
        this.marca = "";
        this.modelo = "";
        this.piezas = new LinkedList<Pieza3>();
    }

    public Ordenador3(String marca, String modelo, List<Pieza3> pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = pieza;
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

    public List<Pieza3> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<Pieza3> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Ordendor3{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + piezas +
                '}';
    }
}
