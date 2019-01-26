import java.util.TreeSet;

/**
 * Introducir por teclado, hasta que se introduzca "fin",
 * una serie de nombres que se insertarán por orden alfabético
 * en una colección, de forma que no permita repeticiones.
 * Mostrar la lista de nombres por pantalla.
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio6 {
	TreeSet<String> listaNombre;
	/**
	 * 
	 */
	public Ejercicio6() {
		listaNombre = new TreeSet<String>();
	}
	
	public void anadir(String nombre) {
		listaNombre.add(nombre);
	}
	
	public String visualizar() {
		listaNombre.remove("fin");
		return listaNombre.toString();
	}

}
