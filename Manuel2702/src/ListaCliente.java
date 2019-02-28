import java.util.ArrayList;

/**
 * Clase Lista Cliente donde se encuentran los metodos para la lista.
 * @author Manuel Melero
 *
 */

public class ListaCliente extends ArrayList<Cliente> {
	
	//Añadir cliente a la lista.
	public void anadir(Cliente e) {
		add(e);
	}
	
	//Buca los cliente a modificar mediante su id.
	public Cliente modificar(int id) {
		return buscar(id);
		
		
	}
	
	/**
	 * Metodo para borrar clients de la lista,
	 * @param id Es el id del cliente. Utilizado en la busqueda, dle metodo privado.
	 * @return Devuelve 1 si se ha eliminado correctametne  y -1 en caso contrario.
	 */
	public int eliminar(int id) {
		int error = -1;
			if (remove(buscar(id))) {				
				error = 1;
			}
		return error;
	}
		
	/**
	 * Metodo privado que busca a un cliente por id 
	 * @param id Es el id del cliente. Utilizado en la busqueda
	 * @return Devuelve el obje cliente.
	 */
	private Cliente buscar(int id) {
		Cliente cliente = null;
		for(Cliente cli : this) {
			if(cli.getIdCliente() == id) {
				cliente = cli;
			}
		}
		return cliente;
	}

}
