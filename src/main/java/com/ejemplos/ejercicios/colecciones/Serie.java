package com.ejemplos.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serie implements Serializable {
    private static final long serialVersionUID =1L;

    private String titulo;
    private String genero;
    private Integer agnoPublicacion;

    private List<Actor> reparto;
}
