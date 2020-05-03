package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Leer;

public class Ordenamiento {

	private Leer l = new Leer();

	public void burbuja() {
		int aux;
		ArrayList<Integer> burbuja = new ArrayList<Integer>();
		File numero = new File("./src/data/numero");
		l.leerNum(numero, burbuja);

		System.out.println("Arreglo sin ordenar");
		for (int i = 0; i < 10; i++) {
			System.out.print(burbuja.get(i) + " ");
		}
		
		for (int i = 0; i < burbuja.size() - 1; i++) {
			for (int j = i + 1; j < burbuja.size() - 1; j++) {
				if (burbuja.get(i) < burbuja.get(j)) {
					aux = burbuja.get(i);
					burbuja.set(i, burbuja.get(j));
					burbuja.set(j, aux);
				}
			}
		}
		System.out.println("\nArreglo ordenado de mayor a menor");
		for (int i = 0; i < burbuja.size(); i++) {
			System.out.print(burbuja.get(i) + " ");

		}

		for (int i = 0; i < burbuja.size() - 1; i++) {
			for (int j = 0; j < burbuja.size() - 1; j++) {
				if (burbuja.get(j + 1) < burbuja.get(j)) {
					aux = burbuja.get(j + 1);
					burbuja.set(j + 1, burbuja.get(j));
					burbuja.set(j, aux);
				}
			}
		}
		System.out.println("\nArreglo ordenado de menor a mayor");
		for (int i = 0; i < burbuja.size(); i++) {
			System.out.print(burbuja.get(i) + " ");

		}

	}

}
