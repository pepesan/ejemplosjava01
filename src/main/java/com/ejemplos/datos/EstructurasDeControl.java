package com.ejemplos.datos;

import java.time.LocalDate;
import java.time.Month;

public class EstructurasDeControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejemplos de estructuras de control
		int i=0;
		int j=1;
		// IF sentencia condicional
		if (i<j){
			System.out.println("i es menor que j");
		}
		if (i<j)
			// sólo una línea sin {}
			System.out.println("i es menor que j");

		if(i<j){
			System.out.println("i es menor que j");
		}else{
			System.out.println("i no es menor que j");
		}
		i=0;
		j=1;
		if(i>j){
			System.out.println("i es mayor que j");
		}else{
			System.out.println("i no es mayor que j");
		}
		if(i<=j){
			System.out.println("i es menor o igual que j");
		}else{
			System.out.println("i no es menor o igual que j");
		}
		if(i>=j){
			System.out.println("i es mayor o igual que j");
		}else{
			System.out.println("i no es mayor o igual que j");
		}
		if(i==j){
			System.out.println("i es igual que j");
		}else{
			System.out.println("i no es igual que j");
		}
		if(i!=j){
			System.out.println("i es distinto que j");
		}else{
			System.out.println("i no es distinto que j");
		}
		// cuando trabajamos conn objetos y no variables de tipo primitivo
		// trabajamos con referencias
		// cada objeto nuevo tiene su referencia única
		String c1= new String("Hola");
		String c2= new String("Hola");
		if(c1==c2){
			System.out.println("Las referencias son iguales, " +
					"aunque contengan el mismo valor");
		}else {
			System.out.println("Los objetos son distintos, " +
					"aunque contengan el mismo valor");
		}
		// usamos en objetos el método equals para comparar si son iguales
		// comprobamos que tienen el mismo contenido
		if(c1.equals(c2)){
			System.out.println("Los objetos cadena son iguales");
		}else{
			System.out.println("Los objetos cadena no son iguales");
		}
		i=1;
		j=1;
		//operadores l�gicos
		// Operación AND
		if(i==j && c1.equals(c2)){
			System.out.println("Se cumplen las dos condiciones");
		}else{
			System.out.println("No se cumplen las dos condiciones");
		}
		// Operación OR
		if(i==j || c1.equals("Pepe")){
			System.out.println("Se cumple al menos una de " +
					"las dos condiciones, aunque c1 vale \""+c1+"\"");
		}else{
			System.out.println("No se cumplen ninguna de " +
			"las dos condiciones");
		}


		boolean cierto = true;
		if (cierto== true){
			System.out.println("Cierto es True");
		}
		if (cierto){
			System.out.println("Cierto es True");
		}
		// Operación Not (binario)
		cierto=false;
		if (!cierto){
			System.out.println("!Cierto es True");
			System.out.println("Cierto es False");
		}


		//operadores de bits
		int k=5;
		int p=7;
		boolean b =true;
		long c=5;
		b= b|(++c>0);
		System.out.println("b vale "+b);
		System.out.println("c vale "+c);
		System.out.println("k & p vale "+(k&p));
		
		//SWITCH
		System.out.println("Switches");
		i=2;
		//solo se puede usar con int's
		switch(i){
			case 1:
				System.out.println("vale 1");
				break;
			case 2:
				// break;
			case 3:
				System.out.println("vale 2 ó 3");
				break;
			default:
				System.out.println("entra en default " +
						"No coincide con los cases");
				break;
		}

		// Java 7
		String cadena= "Valor";
		switch(cadena){
			case "Valor2":
			case "Valor":
				System.out.println("vale 'Valor' ó 'Valor2'");
				break;
			case "Sin Valor":
				System.out.println("Sin Valor");
				break;
			default:
				System.out.println("entra en default " +
						"No coincide con los cases");
				break;
		}
		// Java 12
		// nuevo formato de swtich basado en funciones arrow (flecha) -> {}
		switch (cadena){
			case "Valor2","Valor" -> //{
					// podemos obviar las {} si es sólo una línea
				System.out.println("vale 'Valor' ó 'Valor2'");
			//}
			case "Sin Valor" -> {
				// si hacemos más de una línea es obligatorio ponerlo
				System.out.println("Caso sin valor");
				System.out.println("Sin Valor");
			}
			default-> System.out.println("Otro Valor");
		}
		var resultado= switch (cadena){
            case "Valor2","Valor" -> "Valor 1";
            case "Sin Valor" -> "Sin Valor";
            default-> "Otro Valor";
        };
		System.out.println(resultado);
		System.out.println("fin de Switch");


		// Bucles
		//For
		// for de tipo simple que da 3 vueltas
		var indice = 0;
		for (indice=0;indice<3;indice++){
			System.out.println(indice);
		}
		// for de tipo simple que da 3 vueltas
		indice=0;
		for (;indice<3;){
			System.out.println(indice);
			indice++;
		}
		// while
		// bucle que da 3 vueltas
		i=0;
		while (i<3){
			System.out.println(i);
			i++;
		}
		// do while
		// bucle que da 3 vueltas
		i=0;
		do{
			System.out.println(i);
			i++;
		}while (i<3);

		System.out.println("Entrada al bucle for");
		// condición de salida (i=>10 || j>=8)
		for(i=0,j=0;i<10 && j<8;i++,j--){
		// for (i=0,j=0;i<10;i++, j--){
			System.out.println(i);
			System.out.println(j);
		}
		System.out.println("Salida del bucle for");
		i=0;
		System.out.println("Entrada al bucle while");
		while(i<10){
			System.out.println(i);
			i++;
		}
		System.out.println("Salida del bucle while");
		i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<4);
		System.out.println("Uso de Break en for");
		for (i=0; i<4;i++){
			if (i==2){
				break; // sale cuando i == 2
			}
			System.out.println("For para break: " + i);
		}
		System.out.println("Uso de Break y Continue en for");
		for (i=0; i<4;i++){
			if (i == 1){
				continue; // saltar al final del bucle e iniciar una nueva vuelta
			}
			if (i==3){
				break; // sale del bucle cuando i == 3
			}
			System.out.println("For para break: " + i);
		}

		for (k = 0; k<4; k+=2){
			System.out.println(k);
		}


		//uso de etiquetas en sentencias
		uno: for(i=0;i<10;i++ )
        {
			dos: for(j=0;j<10;j++ )
			{
	           if(i==0){
				   // continue;
				continue dos;           // seguiría en el bucle interno
	           }
	           if(i==1){
	        	   continue uno;       // seguiría en el bucle principal
	           }
	           else{
	        	   break uno;          // se saldría del bucle principal
	           }
			}
       }

		// Java 12

		Month mes = LocalDate.now().getMonth();
		switch (mes) {
			case JANUARY, FEBRUARY, MARCH -> System.out.println("First Quarter");//no break needed
			case APRIL, MAY, JUNE -> System.out.println("Second Quarter");
			case JULY, AUGUST, SEPTEMBER -> System.out.println("Third Quarter");
			case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("Forth Quarter");
			default -> System.out.println("Unknown Quarter");
		}
		// Switch yield
		String result = switch (mes) {
			case JANUARY,
					FEBRUARY,
					MARCH -> {
				//multiple statements can be used here
				yield "First Quarter";
			}
			case APRIL, MAY, JUNE -> {
				//multiple statements can be used here
				yield "Second Quarter";
			}
			case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
			case OCTOBER, NOVEMBER, DECEMBER -> {
				//multiple statements can be used here
				yield "Forth Quarter";
			}
			default -> "Unknown Quarter";
		};
		System.out.println(result);

		// expresión sobre objeto

		Object o = new String("Hola");
		switch (o) {
			case null -> {
				System.out.println("null");
				break;
			}
			case String s -> System.out.println("String: "+ s);
			default -> System.out.println("ni null ni cadena");
		}
	}

}
