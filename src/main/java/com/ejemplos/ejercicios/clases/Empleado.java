package com.ejemplos.ejercicios.clases;

import java.io.Serializable;

public class Empleado
        extends Persona
        implements Serializable {
    public String dni;
    public String tlf;
    protected Double sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.dni = "";
        this.tlf = "";
        this.sueldo = 0d;
        this.cargo = "";
    }

    public Empleado(String nombre, String dni, String tlf, Double sueldo, String cargo) {
        super(nombre);
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
