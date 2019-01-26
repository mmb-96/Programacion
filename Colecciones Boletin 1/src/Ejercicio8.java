import java.util.HashSet;
import java.util.LinkedList;

/**
 * Introducir por consola una frase que conste exclusivamente
 * de palabras separadas por espacios. Almacenar en una lista
 * las palabras de la frase, una cada nodo y mostrar por pantalla
 * las palabras que estén repetidas. A continuación, mostrar las
 * que no lo estén.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio8 {
	LinkedList<String> listaNombre;
	HashSet<String> repe = new HashSet<String>();

	/**
	 * 
	 */
	public Ejercicio8() {
		listaNombre = new LinkedList<String>();
	}
	
	public void anadir(String frase) {
        String [] palabras = frase.split(" ");
        for (String palabra : palabras) {
        	listaNombre.add(palabra);
        }
	}
	
	public String visualizarRepetidas() {
		HashSet<String> lista = new HashSet<String>();
	      for (String palabra : listaNombre) {
	            if (!lista.add(palabra)) {
	                repe.add(palabra);
	            }
	        }
		return repe.toString();
	}
	
	public String visualizarNoRepetidas() {
		LinkedList<String> lista = new LinkedList<String>();
		 for (String palabra : listaNombre) {
	            if (repe.add(palabra)) {
	                lista.add(palabra);
	            }
	        }
		return lista.toString();
	}
	

}
