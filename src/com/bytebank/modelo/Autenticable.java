package com.bytebank.modelo;

public interface Autenticable  {

	public void setClave(String clave);
	public boolean inciciarSesion(String clave);
	
}
