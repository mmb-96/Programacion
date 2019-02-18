/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Cliente implements Comparable<Object> {
	private String dni;
	private String nombre;
	private int edad;
	private int saldo;
	/**
	 * @param dNI
	 * @param nombre
	 * @param edad
	 * @param saldo
	 */
	public Cliente(String dni, String nombre, int edad, int saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}
	
	@Override
	public boolean equals(Object cliente) {
		if (this.dni.equals(((Cliente) cliente).dni)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "El DNI " + dni + " es de " + nombre + " tiene " + edad + " y su saldo es de " + saldo+"�";
		return cadena;
	}
	
	@Override
	public int compareTo(Object o) {
		Cliente c1 = (Cliente) o;
		return dni.compareTo(c1.dni);
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}