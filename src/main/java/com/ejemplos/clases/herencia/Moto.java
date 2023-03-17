package com.ejemplos.clases.herencia;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
public class Moto extends Vehiculo {
    private Boolean haceCaballito;

    public Moto() {
        super();
        this.haceCaballito = false;
    }

    public Moto(Boolean haceCaballito) {
        super();
        this.haceCaballito = haceCaballito;
    }

    public Moto(Float velocidad, Boolean haceCaballito) {
        super(velocidad);
        this.haceCaballito = haceCaballito;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "velocidad=" + getVelocidad() +
                ", haceCaballito=" + haceCaballito +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto miMoto = (Moto) o;
        if (!super.equals(o)) return false;
        return Objects.equals(haceCaballito, miMoto.haceCaballito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(haceCaballito);
    }
}
