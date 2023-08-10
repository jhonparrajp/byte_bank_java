package com.bytebank.test;
public class TestGerente {

	public static void main(String[] args) {
		
		//packeage + classname para poder hacer el llamamiento
		com.bytebank.modelo.Gerente gerente =new com.bytebank.modelo.Gerente();
		//gerente.setSalario(5000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnline");
		gerente.setTipo(1);
		System.out.println(gerente.inciciarSesion("AluraCursosOnline"));
		System.out.println(gerente.getBonificacion());
	}
}
