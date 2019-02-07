import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 3. Diseñar un método que devuelva la diferencia de dos conjuntos
 * (elementos que pertenezcan al primero, pero no al segundo), con la sintaxis:
 * Set diferencia(Set conjunto1, Set conjunto2)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio3 {


	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}
	
	public  <E> Set<E> diferencia(Set<E> conjunto1, Set<E> conjunto2) {
		Set<E> lista = new HashSet<E>();
		Iterator<E> it = conjunto1.iterator();
		E temp;
		while (it.hasNext()) {
			temp = it.next();
			if (!conjunto2.contains(temp)) {
				lista.add(temp);
			}
		}

		return lista;	
	}
}
