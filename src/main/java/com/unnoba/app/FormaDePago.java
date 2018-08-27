package com.unnoba.app;

public abstract class FormaDePago {
	private float importe;
	
	public abstract void pagar(float importe);

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
}
