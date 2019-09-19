package com.ejemplos.ejercicios.clases.main;

import com.ejemplos.ejercicios.clases.Currito;
import com.ejemplos.ejercicios.clases.Empleado;
import com.ejemplos.ejercicios.clases.Jefe;
import com.ejemplos.ejercicios.clases.Persona;

public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado e= new Empleado();
        Empleado e2= new Empleado(
                "David",
                "0789988776A",
                "+34656667878",
                45000d,
                "Gerente");
        Currito c= new Currito();
        c.setSueldo(49000d);
        System.out.println(c.getSueldo());
        c.setContadorMarrones(500);
        System.out.println(c.getContadorMarrones());
        c.setNombre("Pepe");
        System.out.println(c.getNombre());
        c.setCargo("Desarrollador");
        System.out.println(c.getCargo());
        Jefe rato= new Jefe();
        rato.setPrivilegiosEspeciales("Tarjeta Black, Coche de Empresa, Chofer, ...");
        System.out.println(rato.getPrivilegiosEspeciales());
        rato.setSueldo(3000000d);
        // menos mal que hay productividad
        System.out.println(rato.getSueldo());
        // tengo acceso porque estoy accediendo desde el getter que es público
        Persona p = new Currito();
        p.setNombre("Aznar");
        System.out.println(p.getNombre());
        // NO COMPILA Currito currito = new Persona();
        System.out.println(rato);
    }
}
