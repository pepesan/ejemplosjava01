package com.ejemplos.ejercicios.clases;

public class Currito
extends Empleado{
    public Integer contadorMarrones;
    public Currito() {
        super();
        this.contadorMarrones = 0;
    }
    public Currito(Integer contadorMarrones) {
        super();
        this.contadorMarrones = contadorMarrones;
    }

    public Currito(String nombre, String dni, String tlf, Double sueldo, String cargo, Integer contadorMarrones) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.contadorMarrones = contadorMarrones;
    }

    public Integer getContadorMarrones() {
        return contadorMarrones;
    }

    public void setContadorMarrones(Integer contadorMarrones) {
        this.contadorMarrones = contadorMarrones;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "contadorMarrones=" + contadorMarrones +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                // porque es protegido no privado
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
