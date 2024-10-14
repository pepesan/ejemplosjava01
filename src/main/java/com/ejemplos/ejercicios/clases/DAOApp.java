package com.ejemplos.ejercicios.clases;

public class DAOApp {
    public static void main(String[] args) {
        DAO dao = new DAOImpl();

        // Crear algunos clientes
        Cliente cliente1 = new Cliente(1L, "Juan Pérez", "Calle Falsa 123", 30);
        Cliente cliente2 = new Cliente(2L, "Ana López", "Avenida Siempre Viva", 25);
        Cliente cliente3 = new Cliente(3L, "Pedro Martínez", "Plaza Mayor", 40);

        // Añadir clientes al DAO
        dao.add(cliente1);
        dao.add(cliente2);
        dao.add(cliente3);

        // Mostrar todos los clientes
        System.out.println("Clientes actuales:");
        for (Cliente c : dao.findAll()) {
            System.out.println(c);
        }

        // Buscar cliente por ID
        System.out.println("\nBuscar cliente con ID 2:");
        System.out.println(dao.getById(2L));

        // Actualizar cliente por ID
        System.out.println("\nActualizar cliente con ID 3:");
        Cliente clienteActualizado = new Cliente(3L, "Pedro Gómez", "Calle Nueva", 45);
        dao.updateById(3L, clienteActualizado);
        System.out.println(dao.getById(3L));

        // Eliminar cliente por ID
        System.out.println("\nEliminar cliente con ID 1:");
        dao.deleteById(1L);
        System.out.println("Clientes después de la eliminación:");
        for (Cliente c : dao.findAll()) {
            System.out.println(c);
        }
    }
}

