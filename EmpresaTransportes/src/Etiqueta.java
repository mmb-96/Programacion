/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Etiqueta {
	private String nombreDestinatario;
	private String direccion;
	private int codPostal;
	private String provincia;
	
	/**
	 * @param nombreDestinatario
	 * @param direccion
	 * @param codPostal
	 * @param ciudad
	 */
	public Etiqueta(String nombreDestinatario, String direccion, int codPostal, String provincia) {
		super();
		this.nombreDestinatario = nombreDestinatario;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.provincia = provincia;
	}

	/**
	 * @return the nombreDestinatario
	 */
	public String getNombreDestinatario() {
		return nombreDestinatario;
	}

	/**
	 * @param nombreDestinatario the nombreDestinatario to set
	 */
	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the codPostal
	 */
	public int getCodPostal() {
		return codPostal;
	}

	/**
	 * @param codPostal the codPostal to set
	 */
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param ciudad the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@Override
	public String toString( ) {
		String cadena;
		cadena = nombreDestinatario + " su direccion es " + direccion + " con codigo postal " + codPostal + " en la provincia de " +  provincia;
		return cadena;
	}
		
}