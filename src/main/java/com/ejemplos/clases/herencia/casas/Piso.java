package com.ejemplos.clases.herencia.casas;

import lombok.Data;

@Data
public class Piso extends Casa{
    private Integer numPiso;

    Piso(){
        super();
        this.numPiso = 0;
    }

    public Piso(String direccion, Float metrosCuadrados, Integer numPiso) {
        super(direccion, metrosCuadrados);
        this.numPiso = numPiso;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "direccion=" + getDireccion() + ", "+
                "metrosCuadrados=" + getMetrosCuadrados() + ", "+
                "numPiso=" + numPiso +
                '}';
    }
}
