import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 6. Implementar la función leeCadena, con el siguiente prototipo:
 * List<Character> leeCadena() Dicha función lee una cadena por teclado
 * y nos a devuelve en una lista con un carácter en cada nodo.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio6 {

	/**
	 * 
	 */
	public Ejercicio6() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Character> leeCadena(File fichero) throws IOException {
		List<Character> listacarracter = new LinkedList<>();
		String cadena;
		BufferedReader bfr = new BufferedReader(new FileReader(fichero));
		cadena = bfr.readLine();
		for (int i = 0; i < cadena.length(); i++) {
			listacarracter.add(cadena.charAt(i));
		}
		bfr.close();
		return listacarracter;
	}
	

}
