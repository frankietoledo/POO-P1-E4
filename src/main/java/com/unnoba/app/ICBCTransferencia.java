package com.unnoba.app;

public class ICBCTransferencia extends Transferencia {

	private Banco icbc = new Banco();
	private int CBU;
	@Override
	public void pagar(float importe) {
		icbc.transferir(CBU,importe);
	}
	public ICBCTransferencia(int cBU, Banco icbc, int cBU2) {
		super(cBU);
		this.icbc = icbc;
		CBU = cBU2;
	}
	
	
	
}
