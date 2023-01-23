package com.ejemplos.clases.abstractas;

import java.io.Serializable;
import java.util.Date;

public class Pistola implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 
			1613293477182542506L;

	private String modelo;
	
	private String marca;
	
	private Date fechafac;

	public Pistola() {
		super();
		this.modelo = "";
		this.marca = "";
		this.fechafac = new Date();
	}
	
	public Pistola(String modelo, String marca, Date fechafac) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.fechafac = fechafac;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getFechafac() {
		return fechafac;
	}

	public void setFechafac(Date fechafac) {
		this.fechafac = fechafac;
	}

	public long getSerialVersionUID(){
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pistola [modelo=" + modelo + ", marca=" + marca + ", fechafac="
				+ fechafac + "]";
	}
	
	

}
