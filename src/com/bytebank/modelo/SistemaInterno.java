package com.bytebank.modelo;

public class SistemaInterno {

	private  String clave ="AluraCursosOnline";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion=gerente.inciciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
