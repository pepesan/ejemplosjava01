package com.ejemplos.datos;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;

public class Cadenas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración del objeto
		String texto1 = null;
		System.out.println(texto1);
		// Inicialización del objeto
		texto1 = "¡Prueba de texto!";
		System.out.println(texto1);
		// Inicialización en base al constructor de la Clase
		texto1 = new String ("¡Prueba de texto!");
		System.out.println(texto1);
		char [] miPalabra = {'P','r','u','e','b','a'};
		texto1 = new String(miPalabra);
		System.out.println(texto1);
		System.out.println(texto1.length());
		System.out.println("Hola Mundo!".length());
		System.out.println("Referencias");
		String texto2; // = null;
		texto2=texto1;
		System.out.println(texto1);
		System.out.println(texto2);
		if(texto1== texto2){
			System.out.println("Ambas referencias son iguales");
		}
		if (texto1.equals(texto2)){
			System.out.println("Ambos textos son iguales");
		}
		System.out.println(texto2);
		texto2 ="Este es un texto que ocupa " +
 				"varias líneas, no obstante se puede "+
 				"perfectamente encadenar";
		System.out.println(texto2);
		if(texto1!= texto2){
			System.out.println("Ambas referencias NO son iguales");
		}
		if (!texto1.equals(texto2)){
			System.out.println("Ambos textos NO son iguales");
		}
		texto2 += 12;
		System.out.println(texto2);
		char[] palabra = {'P','a','l','b','r','a'};//Array de char
		String cadena = new String(palabra);
		byte[] datos = {97,98,99};
		try {
			String codificada = new String (datos, "8859_1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String s="Hola Mundo";
		System.out.println(s);
		System.out.println(s.length());
		s+="Adios Mundo";
		// La referencia s ha perdido el enlace al primer objeto
		// La referencia s ahora apunta a otro objeto
		// El recolector de basura eventualmnente liberará la memoria del primer objeto
		System.out.println(s);
		System.out.println(s.length());
		// String Buffer
		System.out.println("StringBuffer");
		StringBuffer s2=new StringBuffer("Hola Mundo");
		System.out.println(s2);
		System.out.println(s2.length());
		s2.append("!!!");
		System.out.println(s2);
		System.out.println(s2.length());
		String s3="Hola Mundo";
		if(s2.equals(s3)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		char c;
		c=s2.charAt(0);
		System.out.println(c);
		String s4=s.substring(0, 3);
		System.out.println(s4);
		int i;
		i=s.indexOf("Mundo");
		System.out.println(i);
		s=s.replace('H', 'h');
		System.out.println(s);
		System.out.println(String.valueOf(s));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String dias="Lunes,Martes,Miércoles,Jueves," +
				"Viernes,Sábado,Domingo";
		String [] arrayDias=dias.split(",");
		for(String dia:arrayDias){
			System.out.println(dia);
		}

		// JAVA 11
		// quitar espacios en blanco
		s = "  test string  ";
		System.out.printf("'%s'%n", s);
		String striped = s.strip();
		System.out.printf("strip():%n '%s'%n", striped);
		String trimmed = s.trim();
		System.out.printf("trim():%n '%s'%n", trimmed);
		// quitar desde le principio
		striped = s.stripLeading();
		System.out.printf("stripLeading():%n '%s'%n", striped);
		// quitar desde el final
		striped = s.stripTrailing();
		System.out.printf("stripTrailing():%n '%s'%n", striped);

		// ¿Está en blanco?
		System.out.println("isBlank");
		s = "";
		boolean blank = s.isBlank();
		System.out.println(blank);
		s = " ";
		blank = s.isBlank();
		System.out.println(blank);

		// líneas de la cadena
		System.out.println("lines");
		s = "jujube\nsatsuma\nguava";
		s.lines()
				.forEach(System.out::println);
		// repetir?
		s = "--";
		String newString = s.repeat(10);
		System.out.println(newString);
		// Uso de emojis en Strings
		s = "\uD83E\uDD29 Star-Struck";
		System.out.println(s); //GRINNING FACE EMOJI
		s = "\uD83D\uDE00 Smiling face";
		System.out.println(s); //Smiling FACE EMOJI
		s = "🧛 Vampire";
		System.out.println(s); //Vampire EMOJI
		s= "\uD83D\uDC83 Woman Dancing";
		System.out.println(s); //Woman Dancing EMOJI

		// De momento no funciona XD (Feb  2022)
		//String Vampire🧛 = "\uD83E\uDDDB";


		// Java 12
		// indentado
		String str = "a test string";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println("-- indented string --");
		String indentedStr = str.indent(5);
		System.out.println(indentedStr);
		System.out.println(indentedStr.length());
		// con saltos de línea
		str = "a test string";
		System.out.println(str);
		indentedStr = str.indent(5);
		System.out.println(indentedStr.endsWith("\n"));
		System.out.printf("'%s'%n", indentedStr);
		System.out.println("-- indented string with quotes --");
		// multilínea
		str = "a test\nstring";
		System.out.println(str);
		System.out.println("-- indented string --");
		indentedStr = str.indent(5);
		System.out.println(indentedStr);

		// negativo
		str = "     a test\n     string";
		System.out.println(str);
		indentedStr = str.indent(-2);
		System.out.println("-- negatively indented string --");
		System.out.println(indentedStr);

		// negativo sin espacio suficiente
		str = "  a\n    test\n        string";
		System.out.println(str);
		indentedStr = str.indent(-6);
		System.out.println("-- negatively indented string --");
		System.out.println(indentedStr);

		// transformaciones
		str = "1000";
		Integer integer = str.transform(Integer::parseInt);
		System.out.println(integer);
		// Java 13
		// Strings multilínea
		String inputElement = """
                            Name: Jenny
                            Phone: 8675309
                            age: 35
                            """;

		System.out.println(inputElement);
		// alineamiento
		inputElement = """
                            Name: Jenny
                        Phone: 8675309
                            age: 35
                            """;

		System.out.println(inputElement);
	}

}
