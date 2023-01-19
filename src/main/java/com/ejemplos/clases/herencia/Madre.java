package com.ejemplos.clases.herencia;

import java.util.Objects;

public class Madre {
    private String name;
    public Madre() {
        this.name = "";
    }
    public Madre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Madre{" +
                "name='" + name + '\'' +
                '}';
    }

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
