package com.ejemplos.clases;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DatoLombok {
    private String name;
    private Integer age;

    public DatoLombok() {
        this.name = "";
        this.age = 0;
    }
}
