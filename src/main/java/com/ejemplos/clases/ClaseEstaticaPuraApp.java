package com.ejemplos.clases;

// no es necesario porque están en el mismo paquete
import com.ejemplos.clases.ClaseEstaticaPura;
// importación de un método estático de una clase;
import static com.ejemplos.clases.ClaseEstaticaPura.suma;
public class ClaseEstaticaPuraApp {
    public static void main(String[] args) {
        int i = 1, j= 2;
        int res = 0;
        res = ClaseEstaticaPura.suma(i,j);
        System.out.println(res);
        res = suma(i,j);
        System.out.println(res);

        // Acceso a atributos estáticos
        System.out.println(ClaseEstaticaPura.numero);
        ClaseEstaticaPura.numero  = 3;
        System.out.println(ClaseEstaticaPura.numero);

        // Clase estática Math
        double d = Math.pow(2,3);
        System.out.println(d);

    }
}
