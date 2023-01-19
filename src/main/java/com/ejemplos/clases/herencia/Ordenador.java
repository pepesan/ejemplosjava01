package com.ejemplos.clases.herencia;

import java.util.Objects;

public class Ordenador {
    private String cpu;
    private Integer memoria;
    private Integer hdd;

    public Ordenador() {
        this.cpu = "";
        this.memoria = 0;
        this.hdd = 0;
    }

    public Ordenador(String cpu, Integer memoria, Integer hdd) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "cpu='" + cpu + '\'' +
                ", memoria=" + memoria +
                ", hdd=" + hdd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordenador ordenador = (Ordenador) o;
        return Objects.equals(cpu, ordenador.cpu) && Objects.equals(memoria, ordenador.memoria) && Objects.equals(hdd, ordenador.hdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memoria, hdd);
    }
}
