package com.ejemplos.clases.herencia;

public class SubClase extends SuperClase {

	@Override
	public void haceAlgo(){
		//super.haceAlgo();
		System.out.println("Hace algo en hija");
		//tambien haceAlgo() de la clase madre

	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClase clasePeque= new SubClase();
		clasePeque.haceAlgo();
		System.out.println(clasePeque.i);
		System.out.println(clasePeque.j);
		System.out.println(clasePeque.getK());
	}

}
