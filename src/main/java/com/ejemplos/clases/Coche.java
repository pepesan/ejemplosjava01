package com.ejemplos.clases;

import java.util.Objects;

public class Coche {
    private String matricula;
    private Integer numRuedas;

    Coche(){
        this.matricula = "";
        this.numRuedas = 4;
    }

    public Coche(String matricula, Integer numRuedas) {
        this.matricula = matricula;
        this.numRuedas = numRuedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", numRuedas=" + numRuedas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula) && Objects.equals(numRuedas, coche.numRuedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, numRuedas);
    }
}
