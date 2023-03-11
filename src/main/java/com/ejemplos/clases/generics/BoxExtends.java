package com.ejemplos.clases.generics;

public class BoxExtends <T extends Animal>{
    private Animal datos;

    BoxExtends(T datos){
        this.datos = datos;
    }

    public void setDatos(T datos){
        this.datos = datos;
    }

    public T getDatos(){
        return (T) this.datos;
    }

    @Override
    public String toString() {
        return "BoxExtends{" +
                "datos='" + datos.toString() + '\'' +
                '}';
    }
}
