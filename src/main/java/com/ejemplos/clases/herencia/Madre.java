package com.ejemplos.clases.herencia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Madre {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Madre madre = (Madre) o;
        return Objects.equals(name, madre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
