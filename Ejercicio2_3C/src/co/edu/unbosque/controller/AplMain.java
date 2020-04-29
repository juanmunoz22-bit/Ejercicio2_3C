package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;

public class AplMain {

	public static void main(String[] args) {
		
		Ordenamiento o = new Ordenamiento();
		
		for (int i = 0; i < 10; i++) {
			int[] a = (o.burbuja());
			System.out.println(a[i]);
		}
	}

}
