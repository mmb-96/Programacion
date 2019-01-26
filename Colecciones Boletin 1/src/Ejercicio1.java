import java.util.ArrayList;
import java.util.Collections;

/**
 * Crear una colección de 20 números enteros aleatorios menores que 100,
 * y guardarlos en el orden en que se vayan generando; mostrar por pantalla
 * dicha lista una vez creada. Ordenarla en sentido creciente y volver a
 * mostrarla por pantalla.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio1 {
	ArrayList<Integer> num;
	/**
	 * 
	 * 
	 */
	public Ejercicio1() {
		num = new ArrayList<>();
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
		Collections.sort(num);
		return num.toString();
	}

}
