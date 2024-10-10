package com.ejemplos.clases;

public class ClienteApp {
    public static void main(String[] args) {
        Cliente cliente;
        cliente = new Cliente();
        System.out.println(cliente);
        cliente.nombre = "BBVA";
        System.out.println(cliente.nombre);
        cliente.setCifnif("B12345678");
        System.out.println(cliente.getCifnif());

        Cliente bbva= new Cliente("BBVA","A12345678");
        System.out.println(bbva);
        bbva = new Cliente("BBVA");
    }
}
