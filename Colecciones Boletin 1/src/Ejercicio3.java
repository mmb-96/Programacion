import java.util.Collections;
import java.util.TreeSet;

/**
 * Crear una colecci�n de 20 n�meros enteros aleatorios
 * distintos menores de 100, guardarlos por orden decreciente
 * a medida que se vayan generando y mostrar la colecci�n por
 * pantalla.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio3 {
	TreeSet<Integer> num;
	/**
	 * 
	 */
	public Ejercicio3() {
		num = new TreeSet<>(Collections.reverseOrder());
	}
	
	public void anadir() {
		while (num.size() < 20) {
			num.add((int) (Math.random()*100));
		}
	}
	
	public String visualizar() {
		return num.toString();
	}

}
