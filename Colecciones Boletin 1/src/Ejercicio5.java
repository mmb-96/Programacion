import java.util.LinkedHashSet;

/**
 * Introducir por teclado, hasta que se introduzca "fin",
 * una serie de nombres que se insertar�n en una colecci�n,
 * de forma que se conserve el orden de inserci�n y que no
 * puedan repetirse. Mostrar la lista por pantalla.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio5 {
	LinkedHashSet<String> listaNombre;
	/**
	 * 
	 */
	public Ejercicio5() {
		listaNombre = new LinkedHashSet<String>();
	}
	
	public void anadir(String nombre) {
		listaNombre.add(nombre);
	}
	
	public String visualizar() {
		listaNombre.remove("fin");
		return listaNombre.toString();
	}

}
