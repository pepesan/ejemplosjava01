package com.ejemplos.clases.herencia;

public class Empleado extends Persona {
    private String puesto;
    private Float sueldo;

    public Empleado(){
        super();
        this.puesto="Currela";
        this.sueldo=0.0f;
    }



    public Empleado(
            String nombre,
            Integer edad,
            String puesto,
            Float sueldo) {
        //super(nombre);
        //this.setEdad(edad);
        super(nombre, edad);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "puesto='" + puesto + '\'' +
                ", sueldo=" + sueldo +
                ", edad="+this.getEdad()+
                ", nombre="+this.getNombre()+
                '}';
    }
}
