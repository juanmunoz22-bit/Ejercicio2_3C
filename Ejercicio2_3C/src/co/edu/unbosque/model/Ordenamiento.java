package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Leer;

public class Ordenamiento {

	private Leer l = new Leer();

	public void burbuja() {
		int aux;
		int[] burbuja = new int[10];
		burbuja[0] = -32;
		burbuja[1] = 45;
		burbuja[2] = -2;
		burbuja[3] = 0;
		burbuja[4] = 4;
		burbuja[5] = 32;
		burbuja[6] = 2;
		burbuja[7] = 1;
		burbuja[8] = 100;
		burbuja[9] = -100;
		System.out.println("Arreglo sin ordenar");
		for (int i = 0; i < 10; i++) {
			System.out.print(burbuja[i] + " ");
		}

		for (int i = 0; i < burbuja.length - 1; i++) {
			for (int j = 0; j < burbuja.length-1; j++) {
				if (burbuja[j + 1] < burbuja[j]) {
					aux = burbuja[j + 1];
					burbuja[j + 1] = burbuja[j];
					burbuja[j] = aux;
				}
			}
		}
		System.out.println("\nArreglo ordenado de menor a mayor");
		for (int i = 0; i < burbuja.length; i++) {
			System.out.print(burbuja[i] + " ");

		}
	}

}
