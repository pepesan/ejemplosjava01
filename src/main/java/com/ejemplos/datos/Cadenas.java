package com.ejemplos.datos;

import java.io.UnsupportedEncodingException;

public class Cadenas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1 = "¡Prueba de texto!";
		System.out.println(texto1);
		texto1 = new String ("¡Prueba de texto!");
		char [] mi_palabra = {'P','r','u','e','b','a'};
		texto1 = new String(mi_palabra);
		System.out.println(texto1);
		System.out.println("Hola Mundo!".length());
		String texto2; // = null;
		texto2=texto1;
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
		String [] adias=dias.split(",");
		for(String dia:adias){
			System.out.println(dia);
		}
	}

}
