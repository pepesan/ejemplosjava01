package com.ejemplos.ejercicios.clases;

public class Jefe
extends Empleado{
    public String privilegiosEspeciales;

    public Jefe() {
        super();
        this.privilegiosEspeciales = "Tarjeta Black";
    }
    public Jefe(String privilegiosEspeciales) {
        super();
        this.privilegiosEspeciales = privilegiosEspeciales;
    }

    public Jefe(String nombre, String dni, String tlf, Double sueldo, String cargo, String privilegiosEspeciales) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.privilegiosEspeciales = privilegiosEspeciales;
    }

    public String getPrivilegiosEspeciales() {
        return privilegiosEspeciales;
    }

    public void setPrivilegiosEspeciales(String privilegiosEspeciales) {
        this.privilegiosEspeciales = privilegiosEspeciales;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "privilegiosEspeciales='" + privilegiosEspeciales + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                // tengo acceso al sueldo porque es protegido no privado
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
