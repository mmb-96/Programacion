import java.util.ArrayList;

/**
 * @author estudiante
 *
 */

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private ArrayList<String> modulos;
	private String empresa;

	public Alumno() {
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param modulos
	 */
	public Alumno(String nombre, String apellidos, String dni, int edad,  ArrayList<String> modulos, String empresa) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.modulos = modulos;
		this.empresa = empresa;
	}
	
	public Alumno(String nombre, String apellidos, String dni, ArrayList<String> modulos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.modulos = modulos;
	}
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	 * @return the modulos
	 */
	public ArrayList<String> getModulos() {
		return modulos;
	}

	/**
	 * @param modulos the modulos to set
	 */
	public void setModulos(ArrayList<String> modulos) {
		this.modulos = modulos;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", modulos="
				+ modulos + ", empresa=" + empresa + "]";
	}
	
}