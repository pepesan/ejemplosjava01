package com.ejemplos.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Ordenador2 implements Serializable {
    private String marca;
    private String modelo;
    private Set<Pieza2> piezas;

    public Ordenador2() {
        this.marca = "";
        this.modelo = "";
        this.piezas = new HashSet<>();
    }


}
