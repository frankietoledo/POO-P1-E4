package com.unnoba.app;

public class TarjetaVisa extends Tarjeta {

	private Banco NaranjaVisa = new Banco();
	
	public TarjetaVisa(String nombre, int numeroTarj, int pinSeguridad) {
		super(nombre, numeroTarj, pinSeguridad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar(float importe) {
		// TODO Auto-generated method stub
		NaranjaVisa.cobrar(super.getNombre(),super.getNumeroTarj(),super.getPinSeguridad(),importe);
	}
	
	
}
