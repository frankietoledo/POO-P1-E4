package com.unnoba.app;

public abstract class Internet extends FormaDePago {

	private String username;
	
	@Override
	public abstract void pagar(float importe);

	public Internet(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	

}
