import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 8. Implementar la función List clonaLista(List lista)
 * que realice una copia exacta de una lista.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio8 {

	/**
	 * 
	 */
	public Ejercicio8() {
		// TODO Auto-generated constructor stub
	}
	
	public int clonaLista(File fichero) throws IOException {
		int devueve;
		String cadena;
		BufferedReader bfr = new BufferedReader(new FileReader(fichero));
		cadena = bfr.readLine();
		bfr.close();
		File fich = new File("Ejercicio8.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fich));
		bw.write(cadena);
		bw.close();
		BufferedReader bfr1 = new BufferedReader(new FileReader(fichero));
		BufferedReader bfr2 = new BufferedReader(new FileReader(fich));
		
		if (bfr1.readLine().equals(bfr2.readLine())) {
			devueve = 1;
		} else {
			devueve = -1;
		}
		bfr1.close();
		bfr2.close();
		return devueve;
	}
}
