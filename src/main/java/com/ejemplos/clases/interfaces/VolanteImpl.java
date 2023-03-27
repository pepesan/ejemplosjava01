package com.ejemplos.clases.interfaces;

import lombok.Data;

public class VolanteImpl implements Volante{

    public Float gradosActuales;

    VolanteImpl(){
        gradosActuales = 0.0F;
    }

    VolanteImpl(Float gradosActuales){
        this.gradosActuales = gradosActuales;
    }
    @Override
    public void girarDerecha(Float grados) {
        this.gradosActuales+= grados;
    }

    @Override
    public void girarIzquierda(Float grados) {
        this.gradosActuales-= grados;
    }
}
