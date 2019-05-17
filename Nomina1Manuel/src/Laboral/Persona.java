/**
 * Clase Persona.
 */
package Laboral;
/**
 * 
 * @author Manuel Melero
 *
 */
public class Persona {
	
	public String nombre;
	public String dni;
	public char sexo;
	
	/**
	 * Constructor con tres parametros
	 * @param nombre Nombre de la persona
	 * @param dni Dni de la persona
	 * @param sexo Sexo de la persona
	 */
	public Persona(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	/**
	 * Constructor con dos parametros
	 * @param nombre Nombre de la persona
	 * @param dni Dni de la persona
	 */
	public Persona(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	/**
	 * 
	 * @param dni Parametro para cambiar o asignar el DNI de la persona.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * 
	 * @return Este metodo devuelve las atrributos de una persona.
	 */
	public String imprime() {
		return "nombre=" + nombre + ", dni=" + dni;
	}
}