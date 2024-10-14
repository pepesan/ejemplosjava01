package com.ejemplos.ejercicios.clases;

import java.util.Arrays;

public class DAOImpl implements DAO {
    private Cliente[] clientes;
    private int size;

    public DAOImpl() {
        clientes = new Cliente[10]; // Array inicial de tamaño 10
        size = 0;
    }

    @Override
    public Cliente[] findAll() {
        return Arrays.copyOf(clientes, size); // Devuelve solo los clientes no nulos
    }

    @Override
    public void add(Cliente cliente) {
        if (size == clientes.length) {
            clientes = Arrays.copyOf(clientes, size * 2); // Duplicamos el tamaño si se llena
        }
        clientes[size++] = cliente;
    }

    @Override
    public Cliente getById(Long id) {
        for (int i = 0; i < size; i++) {
            if (clientes[i] != null && clientes[i].getId().equals(id)) {
                return clientes[i];
            }
        }
        return null; // Si no encuentra el cliente
    }

    @Override
    public Cliente updateById(Long id, Cliente clienteActualizado) {
        Cliente cliente = new Cliente();
        for (int i = 0; i < size; i++) {
            if (clientes[i] != null && clientes[i].getId().equals(id)) {
                clientes[i] = clienteActualizado;
                cliente = clientes[i];
            }
        }
        return cliente;
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < size; i++) {
            if (clientes[i] != null && clientes[i].getId().equals(id)) {
                clientes[i] = null; // Eliminamos el cliente poniéndolo a null
                return;
            }
        }
    }
}

