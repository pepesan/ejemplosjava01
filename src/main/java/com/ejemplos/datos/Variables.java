package com.ejemplos.datos;

import java.util.Optional;

public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		byte n;
		// Iniciación de la variable
		n=3;
		System.out.println(n);
		int i=1;
		System.out.println(i);
		short j=3;
		System.out.println(j);
		long k=2000000000;
		System.out.println(k);
		char c='森';
		System.out.println(c);
		float f=3.4f;
		System.out.println(f);
		double d=3.4;
		System.out.println(d);
		boolean bool=true;
		System.out.println(bool);

		// casting
		byte b=1;
		int i2=(int)b;
		System.out.println(i2);

		// Java 8
		// tipo Opcional
		Optional<Integer> enteroOpcional = Optional.of(12);
		System.out.println(enteroOpcional.get());
		enteroOpcional = Optional.empty();
		// Si voy a por el get saltaría una excepción
		enteroOpcional.ifPresent(System.out::println);

		// nuevo en Java 9
		// variables con tipo inferido
		var variableConTipo = "Variable sin Tipo Explicito";
		System.out.println(variableConTipo);
		var caracter = 'A';
		System.out.println(caracter);
		// No es capaz de inferir el tipo, no compila
		//var objetoVacio = null;
		String cadena = null;
		cadena = "valor";

	}

}
