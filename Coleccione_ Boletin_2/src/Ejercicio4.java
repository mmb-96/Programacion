import java.util.Set;

/**
 * 4. Escribir el método incluido() que devuelve true si todos los elementos del primer
 * conjunto pertenecen al segundo y false si hay algún elemento del primero que no
 * pertenezca al segundo. Su sintaxis es:
 * boolean incluido(Set conjunto1, Set conjunto2)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio4 {

	public Ejercicio4() {
		// TODO Auto-generated constructor stub
	}
	
	public <E> boolean incluido(Set<E> conjunto1, Set<E> conjunto2) {
		boolean incluido = false;
		if (conjunto1.containsAll(conjunto2)) {
			incluido = true;
		}
		return incluido;
	}
}
