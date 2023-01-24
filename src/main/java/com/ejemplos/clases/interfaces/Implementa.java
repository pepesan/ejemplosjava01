package com.ejemplos.clases.interfaces;

public class Implementa implements Interfaz {


	public void funcion1() {
		// TODO Auto-generated method stub
		System.out.println("Hace algo");
	}


	public int function2(Integer i) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementa i= new Implementa();
		int j;
		Integer k= 5;
		j=i.function2(k);
		System.out.println(j);
	}

}
