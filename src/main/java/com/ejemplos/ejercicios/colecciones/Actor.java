package com.ejemplos.ejercicios.colecciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor implements Serializable {
    private static final long serialVersionUID =2L;
    private String nombre;
    private String generoFavorito;
    private Integer agnosExperiencia;
}
