package com.ejemplos.clases.herencia;

import lombok.Data;

@Data
public class Vehiculo {
    private Float velocidad;

    public Vehiculo() {
        this.velocidad = 0.0f;
    }

    public Vehiculo(Float velocidad) {
        this.velocidad = velocidad;
    }


}
