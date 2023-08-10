package com.bytebank.test;

public class TestMain {
	
 public static void main(String[] args) {
	 
	 for (int i =0; i<args.length; i++) {
		 System.out.println(args[i]);
	 }

	 int edad=20;
	 int edad2=15;
	 int edad3 =67;
	 
	 //Quiero agruparlas en una sola referencia
	 // indices       1  2  3  4  5
	 //   			 [ 0|1 |2 |3 |4 |]
	 
	 int [] edades= new int [5];
	 edades[2] = 30;
	 
	 System.out.println( edades[2]);
	 System.out.println( edades[0]);
	 //System.out.println(edades[5]);
	 
	 int tamanoArray= edades.length;
	 System.out.println(tamanoArray);
	 
	 //imprimimos todos los valores de el array usando un for
	 for (int i =0; i<tamanoArray; i++) {
		 System.out.println(edades[i]);
	 }
	 
	 
}
 
}
