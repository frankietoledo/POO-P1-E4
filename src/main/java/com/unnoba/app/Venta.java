package com.unnoba.app;

public class Venta {

	public Venta(float importe, FormaDePago fdp) {
		super();
		this.importe = importe;
		this.fdp = fdp;
	}

	//Atributos
	private float importe;
	private FormaDePago fdp;
//Metodos
	public void pagar() {};
}
