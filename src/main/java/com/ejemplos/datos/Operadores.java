package com.ejemplos.datos;

public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejemplos de operadores
		int i,j,k;
		double d;
		i=7;
		j=2;
		k=i+j;
		System.out.println(k);
		k=i-j;
		System.out.println(k);
		k=i*j;
		System.out.println(k);
		d= (double) i /j;
		System.out.println(d);
		d=i%j;
		System.out.println(d);
		// preincremento
		++i;
		// i = i +1;
		// postincremento
		i++;
		System.out.println(i);
		i= 1;
		j= 2;
		j = 2 + ++i;
		// j = 2 + ++i;
		// j = 2 + (++i);
		// j = 2 + (2);
		// j = 4;
		// i = 2;
		System.out.println(j);
		i = 1;
		j = 2 + i++;
		// j = 2 + i;
		// ++i;
		// j = 2 + 1;
		// j = 3;
		// i = 2;
		System.out.println(j);
		// postdecremento
		i--;
		System.out.println(i);
		// predecremento
		--i;
		System.out.println(i);
		//Operador condicional
		k=4;
		String s=(k%2==0)?"par":"impar";
		System.out.println(s);
		i=2;
		j=3;
		// i = i +j; // ==5
		i+=j;
		System.out.println(i);
		// i = i - j;
		i-=j;
		System.out.println(i);
		i*=j;
		System.out.println(i);
		float f;
		f=14;
		j=2;
		f/=j;
		System.out.println(f);

		boolean mayorDeEdad, menorDeEdad;
		int edad = 21;
		mayorDeEdad = edad >= 18; //mayorDeEdad será true
		menorDeEdad = !mayorDeEdad; //menorDeEdad será false


		// i = i & j;
		// i&=j;
		for(i=0;i<10;i++){
			if(i==2){
				continue;
			}
			if(i==4){
				break;
			}
			System.out.println(i);
		}

		// Java 14
		// manejo de instanceof
		Object o = new String("Hola!!");
		if (o instanceof String s1 && s1.length() > 5) {
			System.out.println("cadena: "+ s1);
		}
		
	}

}
