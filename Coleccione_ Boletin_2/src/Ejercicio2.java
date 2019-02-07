import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 2. Hacer lo mismo que en el ejercicio anterior pero con la intersección,
 * formada por los elementos comunes a los dos conjuntos:
 * Set intersección(Set conjunto1, Set conjunto2)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}
	
	public  <E> Set<E> interseccipn(Set<E> conjunto1, Set<E> conjunto2) {
		Set<E> lista = new HashSet<E>();
		Iterator<E> it = conjunto1.iterator();
		E temp;
		while (it.hasNext()) {
			temp = it.next();
			if (conjunto2.contains(temp)) {
				lista.add(temp);
			}
		}

		return lista;
		
	}

}
