/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */

public class Arbitro extends Participante{
	private Categoria cat;
	private boolean internacional;

	/**
	 * @param cat Categoria del arbitro, es de tipo enum.
	 * @param internacional boolean si es internacional es true si no es false.
	 */
	public Arbitro(String nombre, String paisProcedencia, int anoNacimiento, Categoria cat, boolean internacional) {
		super(nombre, paisProcedencia, anoNacimiento);
		this.cat = cat;
		this.internacional = internacional;
	}
	
	/**
	 * @return the cat
	 */
	public Categoria getCat() {
		return cat;
	}
	
	/**
	 * @param cat the cat to set
	 */
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	
	/**
	 * @return the internacional
	 */
	public boolean isInternacional() {
		return internacional;
	}
	
	/**
	 * @param internacional the internacional to set
	 */
	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}
}