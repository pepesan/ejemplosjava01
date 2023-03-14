package com.ejemplos.clases.record;

// las clases record son final
// pueden tener atributos, métodos e inicializadores estáticos
// tienen setter y getter ??
// pueden implementar interfaces
// todos los campos van en la constructora
// ppueden declarar una constructora aparte
// pueden tener accesors explícitos
// pueden definir más métodos
// pueden ser clases inner
// pueden ser genéricas
// se pueden anotar
// no pueden ser abstractas
public record Person(String name, String gender, int age) {}
