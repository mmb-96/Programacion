import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 7. Implementar la función uneCadenas con el prototipo:
 * List<Character> uneCadenas(List<Character> cad1, List<Character> cad2)
 * que devuelve una lista con la concatenación de cad1 y cad2.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio7 {

	/**
	 * 
	 */
	public Ejercicio7() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Character> uneCadenas(File fichero1, File fichero2) throws IOException {
		List<Character> listacarracter = new LinkedList<>();
		String cadena;
		BufferedReader bfr = new BufferedReader(new FileReader(fichero1));
		cadena = bfr.readLine();
		for (int i = 0; i < cadena.length(); i++) {
			listacarracter.add(cadena.charAt(i));
		}
		bfr.close();
		BufferedReader bfr2 = new BufferedReader(new FileReader(fichero2));
		cadena = bfr2.readLine();
		for (int i = 0; i < cadena.length(); i++) {
			listacarracter.add(cadena.charAt(i));
		}
		bfr2.close();
		return listacarracter;
	}
	

}
