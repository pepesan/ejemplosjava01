package com.ejemplos.clases.abstractas;

import lombok.Data;

@Data
// No puedo heredar de esta clase porque es final
public final class ClaseFinal {
    private String nombre;

}
