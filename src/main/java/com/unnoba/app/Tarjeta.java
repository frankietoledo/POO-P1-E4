package com.unnoba.app;

public abstract class Tarjeta extends FormaDePago {

	private String nombre;
	private int numeroTarj;
	private int pinSeguridad;
	
	@Override
	public abstract void pagar(float importe);

	public Tarjeta(String nombre, int numeroTarj, int pinSeguridad) {
		super();
		this.nombre = nombre;
		this.numeroTarj = numeroTarj;
		this.pinSeguridad = pinSeguridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroTarj() {
		return numeroTarj;
	}

	public void setNumeroTarj(int numeroTarj) {
		this.numeroTarj = numeroTarj;
	}

	public int getPinSeguridad() {
		return pinSeguridad;
	}

	public void setPinSeguridad(int pinSeguridad) {
		this.pinSeguridad = pinSeguridad;
	}

	
	
}
