package com.ejemplos.clases;

public class Cliente{
    public String nombre;
    private String cifnif;

    Cliente() {
        this.nombre = "";
        this.cifnif = "";
    }
    Cliente(String nombre) {
        this.nombre = nombre;
        this.cifnif = "";
    }
    Cliente(String nombre, String cifnif) {
        this.nombre = nombre;
        this.cifnif = cifnif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCifnif() {
        return cifnif;
    }

    public void setCifnif(String cifnif) {
        this.cifnif = cifnif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cifnif='" + cifnif + '\'' +
                '}';
    }
}
