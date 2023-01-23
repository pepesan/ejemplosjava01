package com.ejemplos.clases.herencia.casas;

import lombok.Data;

@Data
public class ChaletDeLujo extends Chalet{
    private Integer bagnos;
    ChaletDeLujo(){
        super();
        this.bagnos = 0;
    }
    ChaletDeLujo(String direccion, Float metrosCuadrados, Integer plantas, Integer bagnos){
        super(direccion, metrosCuadrados, plantas);
        this.bagnos = bagnos;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "direccion=" + getDireccion() + ", "+
                "metrosCuadrados=" + getMetrosCuadrados() + ", "+
                "plantas=" + getPlantas() + ", "+
                "baños=" + bagnos +
                '}';
    }

}
