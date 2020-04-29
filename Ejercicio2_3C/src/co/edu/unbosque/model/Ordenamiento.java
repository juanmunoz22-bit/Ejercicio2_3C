package co.edu.unbosque.model;



import java.io.File;

import co.edu.unbosque.model.persistence.Leer;

public class Ordenamiento {
	
	private Leer l = new Leer();
	
	public int[] burbuja() {
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
		
		//File numero = new File("./src/data/numero");
		//l.leer(numero, burbuja);
		return burbuja;
	}
	
}
