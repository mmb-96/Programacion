/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */

public class Participante implements Comparable<Participante>{
	private String nombre;
	private String paisProcedencia;
	private int anoNacimiento;

	/**
	 * @param nombre Es el nombre del participante.
	 * @param paisProcedencia Pais de donde procede.
	 * @param anoNacimiento Año de nacimenito.
	 */
	public Participante(String nombre, String paisProcedencia, int anoNacimiento) {
		super();
		this.nombre = nombre;
		this.paisProcedencia = paisProcedencia;
		this.anoNacimiento = anoNacimiento;
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
	 * @return the paisProcedencia
	 */
	public String getPaisProcedencia() {
		return paisProcedencia;
	}
	/**
	 * @param paisProcedencia the paisProcedencia to set
	 */
	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}
	/**
	 * @return the anoNacimiento
	 */
	public int getAnoNacimiento() {
		return anoNacimiento;
	}
	/**
	 * @param anoNacimiento the anoNacimiento to set
	 */
	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	@Override
	public int compareTo(Participante arg0) {
		return nombre.compareTo(arg0.nombre);
	}
	
	
}