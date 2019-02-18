/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Caja {	
	private int ancho;
	private int alto;
	private int fondo;
	private Unidad unidad;
	private Etiqueta etiqueta;
	private double volumen;


	/**
	 * @param ancho
	 * @param alto
	 * @param fondo
	 * @param unidad
	 */
	public Caja(int ancho, int alto, int fondo, Unidad unidad, Etiqueta etiqueta) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
		this.etiqueta = etiqueta;
	}
	
	public double getVolumen() {
		if (unidad.equals(Unidad.CM)) {
			volumen = (ancho/100) * (alto/100) * (fondo/100);
		} else {
			volumen = ancho * alto * fondo;
		}
		return volumen;
	}
	
	@Override
	public String toString() {
		String cadena;
		cadena = "La caja mide " + ancho + " " +  unidad +" de ancho "  + alto + " " + unidad +  " de alto " + fondo + " " + unidad + " de fondo. El destinatario es " + etiqueta.toString(); 
		return cadena;	
	}
	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	/**
	 * @return the fondo
	 */
	public int getFondo() {
		return fondo;
	}

	/**
	 * @param fondo the fondo to set
	 */
	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	/**
	 * @return the unidad
	 */
	public Unidad getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	/**
	 * @return the etiqueta
	 */
	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
}