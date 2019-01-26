import java.util.ArrayList;
import java.util.Collections;

/**
 * Repetir el ejercicio anterior, pero esa vez
 * permitir números repetidos y utilizar números
 * aleatorios menores que 10.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio4 {
	ArrayList<Integer> num;
	/**
	 * 
	 */
	public Ejercicio4() {
		num = new ArrayList<Integer>();
	}
	
	public void anadir() {
		while (num.size() < 20) {
			num.add((int) (Math.random()*10));
		}
	}
	
	public String visualizar() {
		Collections.sort(num, Collections.reverseOrder());
		return num.toString();
	}

}
