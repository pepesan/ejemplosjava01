package com.ejemplos.clases;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatoLombok {
    private String name;
    private Integer age;
}
