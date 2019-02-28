/**
 * Interfaz que tiene declarado los metodos, guardar, leer y eliminar.
 * Que los implementas la clase DB y Fichero.
 * @author Manuel Melero
 *
 */

public interface FichAndDB {

	public boolean guardar(String cadena);
	
	public ListaCliente leer();
	
	public void elinimar();
}
