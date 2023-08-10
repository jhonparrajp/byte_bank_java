package com.bytebank.modelo;

				//extiende de funcionario
public class Gerente extends Funcionario implements Autenticable {
	
	// sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("EJECUANDO DESDE GERENTE");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inciciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
