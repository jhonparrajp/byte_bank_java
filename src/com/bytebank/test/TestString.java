package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {

	public static void main(String[] args) {
		String nombre ="Alura";
		// No utilizada en el mundo real
		//String nombre2= new String ("ALura");
		System.out.println("Antes de metodos: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		// 01234
		char letra =nombre.charAt(3);
		int indice = nombre.indexOf("e");
		
		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorros(200, 300) );
		
		System.out.println();
		}
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
	
}
