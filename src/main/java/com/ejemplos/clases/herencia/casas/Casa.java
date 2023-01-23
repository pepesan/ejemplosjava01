package com.ejemplos.clases.herencia.casas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Casa {
    // cosas comunes a una casa que tubieran Chalet y los pisos
    private String direccion;
    private Float metrosCuadrados;

    Casa(){
        this.direccion = "";
        this.metrosCuadrados = 0.0F;
    }
}
