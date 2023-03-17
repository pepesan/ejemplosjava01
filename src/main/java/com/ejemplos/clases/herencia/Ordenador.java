package com.ejemplos.clases.herencia;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Ordenador {
    private String cpu;
    private Integer memoria;
    private Integer hdd;

    Ordenador(){
        this.cpu = "";
        this.memoria = 0;
        this.hdd = 0;
    }
}
