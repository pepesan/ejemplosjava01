package com.ejemplos.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjetoClonable implements Cloneable{
    private String nombre;

    @Override
    public ObjetoClonable clone() {
        try {
            ObjetoClonable clone = (ObjetoClonable) super.clone();
            clone.setNombre(this.nombre);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
