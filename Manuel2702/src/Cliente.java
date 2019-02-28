/**
 * Clase clienta, genera los clientes de la cafetria del centro que se añadiran a una lista.
 * @author Manuel Melero
 *
 */

public class Cliente {
	private static int id = 0;
	private int idCliente;
	private String nombre;
	private String apellidos;
	private int telefono;

	/**
	 * @param nombre Nombre del cliente
	 * @param apellidos Apellidos del cliente
	 * @param telefono Telefono del cliente
	 */
	public Cliente(String nombre, String apellidos, int telefono) {
		this.idCliente=++id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return idCliente + "," + nombre + "," + apellidos + ","	+ telefono;
	}
		
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
}