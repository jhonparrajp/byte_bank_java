package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		double valorARetirar = valor + 0.2;
		 super.saca(valorARetirar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
}
