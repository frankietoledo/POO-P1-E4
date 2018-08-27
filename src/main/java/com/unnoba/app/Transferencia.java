package com.unnoba.app;

public abstract class Transferencia extends FormaDePago {
	private int CBU;
	
	
	public int getCBU() {
		return CBU;
	}


	public void setCBU(int cBU) {
		CBU = cBU;
	}


	@Override
	public abstract void pagar(float importe);


	public Transferencia(int cBU) {
		super();
		CBU = cBU;
	}
	
}
