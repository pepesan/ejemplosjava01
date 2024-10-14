package com.ejemplos.ejercicios.clases;

public interface DAO {
    Cliente[] findAll();
    void add(Cliente cliente);
    Cliente getById(Long id);
    Cliente updateById(Long id, Cliente cliente);
    void deleteById(Long id);
}

