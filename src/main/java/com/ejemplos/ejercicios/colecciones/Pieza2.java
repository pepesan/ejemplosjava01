package com.ejemplos.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Data
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Pieza2 implements Serializable {
    private String nombre;
    private String tipoDePieza;

    public Pieza2() {
        this.nombre = "";
        this.tipoDePieza = "";
    }

}
