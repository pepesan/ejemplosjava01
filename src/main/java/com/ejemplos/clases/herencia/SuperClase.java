package com.ejemplos.clases.herencia;

public class SuperClase {
	public int i;
	
	protected int j;
	
	private int k;
	
	SuperClase(){
		this.i=0;
		this.j=0;
		this.k=0;
	}
	
	SuperClase(int i){
		this.i=i;
		this.j=0;
		this.k=0;
	}
	
	SuperClase(int i, int j){
		this.i=i;
		this.j=j;
		this.k=0;
	}
	
	SuperClase(int i, int j, int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	public void haceAlgo(){
	System.out.println("Hace algo");
	}
	
//	protected void finalize() throws Throwable{
//		//cosas que quiero hacer al destruir el objeto
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperClase c= new SuperClase();
		c.i=12;
		System.out.println(c.i);
		c.setJ(7);
		System.out.println(c.getJ());
		c.setK(27);
		System.out.println(c.getK());
		SuperClase c2=new SuperClase(2);
		System.out.println(c2.i);
		SuperClase c3=new SuperClase(2,3);
		System.out.println(c3.i);
		System.out.println(c3.getJ());
		SuperClase c4=new SuperClase(2,3,4);
		System.out.println(c4.i);
		System.out.println(c4.getJ());
		System.out.println(c4.getK());
	}

}
