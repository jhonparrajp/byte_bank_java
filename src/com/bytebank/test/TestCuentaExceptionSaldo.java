package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta= new CuentaAhorros(123, 456);
		cuenta.deposita(200);
		cuenta.saca(210);
		
	}
}
