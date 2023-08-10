package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		//List<Cliente> listaClientes= new LinkedList<>();
		
		//forzando a que solo acepte un solo tipo de objeto <Cuenta>
		//obligatorio especificar el tipo de objeto
		List<Cuenta> lista = new ArrayList<>();
		// Referencia Objeto ->HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2= new CuentaCorriente(13, 42);
		Cuenta cc3= new CuentaCorriente(11, 22);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i =0;i <lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//por cada cuenta : lista
		for(Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		//Comparacion basada en valores
		if(contiene) {
			System.out.println("Si; es igual (con equals) ");
		}
		
		
		
	}
	
}
