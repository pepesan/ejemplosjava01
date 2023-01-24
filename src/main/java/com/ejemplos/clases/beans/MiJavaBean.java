package com.ejemplos.clases.beans;

import java.io.Serializable;
import java.util.Objects;

public class MiJavaBean implements Serializable {

    private static final long serialVersionUID = 1234567L;
    private String name;

    public MiJavaBean() {
        this.name = "";
    }

    public MiJavaBean(String name) {
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
        return "MiJavaBean{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiJavaBean that = (MiJavaBean) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
