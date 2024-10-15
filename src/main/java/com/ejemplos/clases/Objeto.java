package com.ejemplos.clases;

import java.util.Objects;

public class Objeto {

	public String s;

	public Objeto(){
		this.s="cadena";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Objeto objeto = (Objeto) o;
		return Objects.equals(s, objeto.s);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto o= new Objeto();
		System.out.println(o);
		o.s="otra cadena";
		System.out.println(o.s);
		Objeto o2=o;
		System.out.println(o2.s);
		System.out.println(o instanceof Objeto);
		if (o instanceof Objeto){
			System.out.println("Es de tipo Objeto");
		}
		if (o.equals(o2)){
			System.out.println("Ambos objetos son iguales");
		}
	}

}
