package com.ejemplos.clases.herencia;

import java.util.Objects;

public class Portatil extends Ordenador{
    private Double bateria;

    Portatil(){
        /*
        this.setCpu("");
        this.setMemoria(0);
        this.setHdd(0);
         */
        // llamada a la constructora de la clase Madre sin parámetros
        // Madre();
        super();
        this.bateria = 0.0;

    }
    Portatil(String cpu, Integer memoria, Integer hdd, Double bateria) {
        // llamada a la constructora de la clase Madre con parámetros
        super(cpu, memoria, hdd);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "cpu='" + this.getCpu() + '\'' +
                ", memoria=" + this.getMemoria() +
                ", hdd=" +this.getHdd() +
                ", bateria=" + this.bateria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Portatil portatil = (Portatil) o;
        return Objects.equals(bateria, portatil.bateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bateria);
    }
}
