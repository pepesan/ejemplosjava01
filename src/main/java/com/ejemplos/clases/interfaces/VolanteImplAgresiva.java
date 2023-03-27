package com.ejemplos.clases.interfaces;

public class VolanteImplAgresiva implements Volante{
    public Float gradosActuales;

    VolanteImplAgresiva(){
        gradosActuales = 0.0F;
    }

    VolanteImplAgresiva(Float gradosActuales){
        this.gradosActuales = gradosActuales;
    }
    @Override
    public void girarDerecha(Float grados) {
        this.gradosActuales+= (grados*2);
    }

    @Override
    public void girarIzquierda(Float grados) {
        this.gradosActuales-= (grados*2);
    }
}
