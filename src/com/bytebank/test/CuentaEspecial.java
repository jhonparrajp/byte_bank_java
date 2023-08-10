package com.bytebank.test;
import com.bytebank.modelo.*;

public class CuentaEspecial extends Cuenta{

	@Override
	public void deposita(double valor) {
		super.saldo = 0.0;
		
	}

	

}
