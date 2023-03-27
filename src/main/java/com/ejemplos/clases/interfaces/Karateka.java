package com.ejemplos.clases.interfaces;

public class Karateka implements Luchador {


	@Override
	public void patada() {
		System.out.println("PAM!");
	}

	@Override
	public void pugnetazo() {
		System.out.println("PUM!");
	}
}
