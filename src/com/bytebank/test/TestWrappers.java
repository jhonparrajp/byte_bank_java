package com.bytebank.test;

public class TestWrappers {

	
	public static void main(String[] args) {
		
		Double numeroDouble= 33.0;//autoboxing
		Boolean verdadero = true ; //autoboxing
		
		Double numeroDouble2= Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		String numeroString = "43";
		
		Double stringtodouble= Double.valueOf(numeroString);
		Integer stringtoInteger= Integer.valueOf(numeroString);
		
		System.out.println(stringtodouble);
		System.out.println(stringtoInteger);
	}
}
