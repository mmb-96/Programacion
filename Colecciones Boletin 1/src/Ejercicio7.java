import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementar una función a la que se pase una lista de nombres y
 * devuelva una copia sin elementos repetidos (sin modificar la original),
 * con el prototipo List eliminaRepetidos(List c)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio7 {
	List<String> listaNombre;
	/**
	 * 
	 */
	public Ejercicio7() {
		listaNombre = new LinkedList<String>();
	}
	
	public void anadir(String nombre) {
		listaNombre.add(nombre);
	}
	
	public LinkedHashSet<String> eliminaRepetidos(List <String>listaNombre) {
		LinkedHashSet<String> lista = new LinkedHashSet<>();
		lista.addAll(listaNombre);
		return lista;
	}
	
	public String visualizarOriginal() {
		listaNombre.remove("fin");
		return listaNombre.toString();
	}
	
	public LinkedHashSet<String> visualizarSinRepetidos() {
		listaNombre.remove("fin");
		return eliminaRepetidos(listaNombre);
	}

}
