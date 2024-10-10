package com.ejemplos.ejercicios.clases;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PerroLombok {
    private String raza;
    private String nombre;

    public PerroLombok() {
        this.raza = "";
        this.nombre = "";
    }
    public PerroLombok(String raza) {
        this.raza = raza;
        this.nombre = "";
    }
}
