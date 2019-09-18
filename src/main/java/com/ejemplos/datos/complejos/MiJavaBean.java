package com.ejemplos.datos.complejos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MiJavaBean implements Serializable {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;

    public MiJavaBean() {
        this.nombre = "";
        this.apellidos = "";
        this.fechaNacimiento = new Date();
    }

    public MiJavaBean(String nombre, String apellidos, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "MiJavaBean{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiJavaBean javaBean = (MiJavaBean) o;
        return Objects.equals(nombre, javaBean.nombre) &&
                Objects.equals(apellidos, javaBean.apellidos) &&
                Objects.equals(fechaNacimiento, javaBean.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, fechaNacimiento);
    }
}
