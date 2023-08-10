package com.bytebank.modelo;

public class GuardaReferencias {

	//Crear un objeto para guardar muchas cuentas
	//permitirnos agregar cuentas con un metodo
	//guardacuentas.adicina(cuenta);
	//remover,obtener,etc.
	
	Object[] referencia = new Object[10];
	int indice =0;
	
	//
	public void adicionar(Object cc) {
		referencia[indice]=cc;
		indice++;
		
	}
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
}
