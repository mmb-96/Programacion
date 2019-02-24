/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */

public class Jugador extends Participante {
	private int posicionRanking;
	private boolean caracterProfesional;
	
	/**
	 * @param posicionRanking Se guarda la posicion en el ranking.
	 * @param caracterProfesional boolean si es profesiona es true si no es false.
	 */
	public Jugador(String nombre, String paisProcedencia, int anoNacimiento, int posicionRanking, boolean caracterProfesional ) {
		super(nombre, paisProcedencia, anoNacimiento);
		this.posicionRanking = posicionRanking;
		this.caracterProfesional = caracterProfesional;
	}

	/**
	 * @return the posicionRanking
	 */
	public int getPosicionRanking() {
		return posicionRanking;
	}

	/**
	 * @param posicionRanking the posicionRanking to set
	 */
	public void setPosicionRanking(int posicionRanking) {
		this.posicionRanking = posicionRanking;
	}


	/**
	 * @return the caracterProfesional
	 */
	public boolean isCaracterProfesional() {
		return caracterProfesional;
	}


	/**
	 * @param caracterProfesional the caracterProfesional to set
	 */
	public void setCaracterProfesional(boolean caracterProfesional) {
		this.caracterProfesional = caracterProfesional;
	}
}