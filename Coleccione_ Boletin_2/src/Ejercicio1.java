import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Implementar el método unión de dos conjuntos, que devuelva
 * un nuevo conjunto con todos los elementos que pertenezcan,
 * al menos, a uno de los dos conjuntos:
 * Set unión(Set conjunto1, Set conjunto2)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio1 {
	/**
	 * 
	 */
	public Ejercicio1() {
	}
	
	public <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
		TreeSet<E> lista = new TreeSet<E>();
		lista.addAll(conjunto1);
		lista.addAll(conjunto2);
		return lista;
	}
}