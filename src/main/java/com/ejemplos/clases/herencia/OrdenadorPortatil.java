package com.ejemplos.clases.herencia;

import lombok.Data;


@Data
public class OrdenadorPortatil extends Ordenador{

    private Double bateria;
    public OrdenadorPortatil() {
        super();
        this.bateria = 0.0;
    }

    public OrdenadorPortatil(
            String cpu,
            Integer memoria,
            Integer hdd,
            Double bateria) {
        super(cpu, memoria, hdd);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "OrdenadorPortatil{" +
                "cpu=" + this.getCpu() +
                ", memoria=" + this.getMemoria() +
                ", hdd=" + this.getHdd() +
                ", bateria=" + this.bateria +
                '}';
    }
}
