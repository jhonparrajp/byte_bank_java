package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestFuncionario {
	
 public static void main(String[] args) {
	Funcionario diego = new Contador();
	
	diego.setDocumento("Diego");
	diego.setSalario(2000);
	diego.setDocumento("1231231232");
	diego.setTipo(0);
	
	System.out.println(diego.getSalario());
	System.out.println(diego.getBonificacion());
			
}
}
