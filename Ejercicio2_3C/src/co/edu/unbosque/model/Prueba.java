package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Leer;

public class Prueba {

	private Leer l = new Leer();
	
	public void insercion() {
		
		int aux, pos;
		ArrayList<String> letras = new ArrayList<String>();
		ArrayList<Integer> n = new ArrayList<Integer>();
		File letra = new File("./src/data/letras");
		l.leerChar(letra, letras);
		
		System.out.println("Arreglo sin ordenar");
		for (int i = 0; i < letras.size(); i++) {
			System.out.print(letras.get(i)+" ");
		}
		
		for(int i=0; i<letras.size(); i++) {
			int asc = letras.get(i).charAt(0);
			n.add(asc);
		}
		
		
		System.out.println("\nArreglo ordenado ascendentemente");
		for(int i = 0; i < n.size()-1; i++) {
			pos = i;
			aux = n.get(i);
			
			while((pos>0) && (n.get(pos-1)>aux)) {
				n.set(pos, n.get(pos-1));
				pos--;
			}
			n.set(pos, aux);
		}
		
		for(int i= 0; i<n.size();i++) {
			int num = n.get(i);
			char c = (char)(num);
			System.out.print(c+" ");
		}
		System.out.println("\nArreglo ordenado descendentemente");
		
		for (int i = n.size()-1; i>=0;i--) {
			int num = n.get(i);
			char c = (char)(num);
			System.out.print(c+" ");
		}
		
	}

	public static void main(String[] args) {
		Prueba p = new Prueba();
		p.insercion();

	}

}
