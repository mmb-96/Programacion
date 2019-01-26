import java.util.ArrayList;
import java.util.Collections;

/**
 * 2. Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio2 {
	ArrayList<Integer> num;
	/**
	 * 
	 */
	public Ejercicio2() {
		num = new ArrayList<Integer>();
	}
	
	public void anadir() {
		for (int i = 0; i < 20; i++) {
			num.add((int) (Math.random()*100));
		}
	}
	
	public String visualizar() {
		return num.toString();
	}
	
	public String ordenar() {
		Collections.sort(num, Collections.reverseOrder());
		return num.toString();
	}

}
