package com.ejemplos.datos;

public class EstructurasDeControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		if (i<j){
			System.out.println("i es menor que j");
		}
		if(i<j){
			System.out.println("i es menor que j");
		}else{
			System.out.println("i no es menor que j");
		}
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
		
		String c1= new String("Hola");
		String c2= new String("Hola");
		if(c1==c2){
			System.out.println("Los objetos son distintos, " +
					"aunque contengan el mismo valor");
		}
		if(c1.equals(c2)){
			System.out.println("Los objetos cadena son iguales");
		}else{
			System.out.println("Los objetos cadena no son iguales");
		}
		i=1;
		j=1;
		//operadores l�gicos
		if(i==j && c1.equals(c2)){
			System.out.println("Se cumplen las dos condiciones");
		}else{
			System.out.println("No se cumplen las dos condiciones");
		}
		if(i==j || c1.equals("Pepe")){
			System.out.println("Se cumple al menos una de " +
					"las dos condiciones, aunque c1 vale \""+c1+"\"");
		}else{
			System.out.println("No se cumplen ninguna de " +
			"las dos condiciones");
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
		i=3;
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
				System.out.println("vale 'Valor'");
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

		switch (cadena){
			case "Valor2","Valor" -> {
				System.out.println("vale 'Valor'");
			}
			case "Sin Valor" -> {System.out.println("Sin Valor");}
			default-> {System.out.println("Otro Valor");}
		}
		var resultado= switch (cadena){
            case "Valor2","Valor" -> "Valor 1";
            case "Sin Valor" -> "Sin Valor";
            default-> "Otro Valor";
        };
		System.out.println(resultado);
		System.out.println("fin de Switch");



		// for de tipo simple
		for (i=0;i<3;i++){
			System.out.println(i);
		}
		// while
		i=0;
		while (i<3){
			System.out.println(i);
			i++;
		}
		// do while
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

		for (i=0; i<4;i++){
			if (i==2){
				break; // sale cuando i == 2
			}
			System.out.println("For para break: " + i);
		}
		//uso de etiquetas en sentencias
		uno: for(i=0;i<10;i++ )
        {
			dos: for(j=0;j<10;j++ )
			{
	           if(i==0){
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
	}

}
