/**
 * 
 */

/**
 * @author Manu
 *
 */
public class CajaCarton extends Caja{
	private static double superficieTotal = 0;
	private double area;

	public CajaCarton(int ancho, int alto, int fondo, Etiqueta etiqueta) {
		super(ancho, alto, fondo, Unidad.CM, etiqueta);	
		area = ((2*(ancho*alto)) + (2*(alto*fondo)) + (2*(fondo*ancho)));
		superficieTotal += area;
	}

	/**
	 * 
	 */
	@Override
	public double getVolumen() {
		double vol = super.getVolumen();
		vol *= 0.8;
		return vol ;
	}
	
	@Override
	public String toString() {
		String cadena;
		cadena = "La caja mide " + this.getAncho() + " " +  this.getUnidad() + " de ancho "  + this.getAlto() + " " + this.getUnidad() +  " de alto " + this.getFondo() + " " + this.getUnidad() + " de fondo. El codigo " + getEtiqueta().toString(); 
		return cadena;	
	}

	/**
	 * @return the superficieTotal
	 */
	public static double getsuperficieTotal() {
		return superficieTotal;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
}