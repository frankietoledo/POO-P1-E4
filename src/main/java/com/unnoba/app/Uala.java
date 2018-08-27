package com.unnoba.app;

public class Uala extends Internet {

	private Banco UalaNet = new Banco();
	
	public Uala(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar(float importe) {
		// TODO Auto-generated method stub
		UalaNet.cobrar(super.getUsername(),importe);
	}

	
}
