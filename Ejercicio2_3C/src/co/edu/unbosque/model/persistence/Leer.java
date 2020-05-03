package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * Clase  que se encarga de leer un archivo de texto para hacer diferentes operaciuones visuales
 * @author Grupo Votacion
 *
 */
public class Leer {

	FileReader fr = null;
	BufferedReader br = null;
	
	/**
	 * Metodo que lee una fecha en un archivo plano
	 * @param fecha Archivo plano  que lee el sistema
	 * @param burbuja1 Listado de caracteres
	 */
	public void leerNum(File numero, ArrayList<Integer> numeros) {
		try {
	        // Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        fr = new FileReader (numero);
	        br = new BufferedReader(fr);
	        // Lectura del fichero
	        String linea;
	        while((linea=br.readLine())!=null) {
	       	 	numeros.add(Integer.parseInt(linea));
	           }
	        
	        
	     }
	     catch(Exception e){
	        e.printStackTrace();
	     }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}
	
}