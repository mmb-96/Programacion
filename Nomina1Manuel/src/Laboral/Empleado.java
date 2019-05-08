/**
 * Clase emplaeado
 */
package Laboral;

/**
 * @author Manuel Melero 
 *
 */
public class Empleado extends Persona{
	
	private int categoria = 1;
	private int anyos = 0;
	
	/**
	 * Constructor con todos parametros
	 * @param nombre Nombre de la empleado
	 * @param dni Dni de la empleado
	 * @param sexo Sexo de la empleado
	 * @param categoria Categoria del empleado
	 * @param anyos Anyo de antiguedad del empleado
	 * @throws DatosNoCorrectoException Lanza una excepcion si no es correcto la categoria y el anyo.
	 */
	public Empleado(String nombre, String dni, String sexo, int categoria, int anyos) throws DatosNoCorrectoException {
		super(nombre, dni, sexo);
		setCategoria(categoria);
		setAnyos(anyos);
	}
	
	/**
	 * Constructor con tres parametros
	 * @param nombre Nombre de la persona
	 * @param dni Dni de la persona
	 * @param sexo Sexo de la persona
	 */
	public Empleado(String nombre, String dni, String sexo) {
		super(nombre, dni, sexo);
	}
	/**
	 * 
	 * @param categoria Categoria del empleado.
	 * @throws DatosNoCorrectoException Excepcion que se lanza si los datos no son correcto.
	 */
	public void setCategoria(int categoria) throws DatosNoCorrectoException {
		if (categoria > 0 && categoria <=10) {
			this.categoria = categoria;
		} else {
			throw new DatosNoCorrectoException("Datos no correcto");
		}
	}
	
	public int getCategoria() {
		return categoria;
	}
	/**
	 * Incrementa el anyo del empleado
	 */
	public void incAnyo() {
		this.anyos = anyos++;
	}
	
	/**
	 * 
	 * @param anyos Años del empleado.
	 * @throws DatosNoCorrectoException Excepcion que se lanza si los datos no son correcto.
	 */
	public void setAnyos(int anyos) throws DatosNoCorrectoException {
		if (anyos > -1) {
			this.anyos = anyos;
		}else {
			throw new DatosNoCorrectoException("Datos no correcto");
		}
	}
	
	public int getAnyos() {
		return anyos;
	}

	@Override
	public String imprime() {
		return nombre + " "+ dni + " " + categoria + " " + anyos;
	}

	
	

}
