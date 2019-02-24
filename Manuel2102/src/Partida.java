/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */
public class Partida implements Juego {
	private Participante j1;
	private Participante j2;
	private Participante ar;
	private Fecha fecha;
	private Ficha ficha;
	private int [] totalmov;
	/**
	 * @param j1 Jugadro 1 con fichas blancas.
	 * @param j2 Jugadro 2 con fichas negras.
	 * @param ar Arbitro de la partida.
	 * @param fecha Fecha en la que se juega la partida.
	 * @param ficha Color de la ficha ganadora, es de tipo enum.
	 * @param totalmov Es un array que guarda el total de movimientos.
	 */
	
	public Partida(Participante j1, Participante j2, Participante ar, Fecha fecha) {
		this.j1 = j1;
		this.j2 = j2;
		this.ar = ar;
		this.fecha = fecha;
	}

	/**
	 * @return the j1
	 */
	public Participante getJ1() {
		return j1;
	}

	/**
	 * @param j1 the j1 to set
	 */
	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}

	/**
	 * @return the j2
	 */
	public Participante getJ2() {
		return j2;
	}

	/**
	 * @param j2 the j2 to set
	 */
	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}

	/**
	 * @return the ar
	 */
	public Participante getAr() {
		return ar;
	}

	/**
	 * @param ar the ar to set
	 */
	public void setAr(Arbitro ar) {
		this.ar = ar;
	}

	/**
	 * @return the fecha
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the ficha
	 */
	public Ficha getFicha() {
		return ficha;
	}

	/**
	 * @param ficha the ficha to set
	 */
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	/**
	 * @return the totalmov
	 */
	public int[] getTotalmov() {
		return totalmov;
	}

	/**
	 * @param totalmov the totalmov to set
	 */
	public void setTotalmov(int[] totalmov) {
		this.totalmov = totalmov;
	}

	@Override
	public void registrarGanador(Ficha fc) {
		this.ficha = fc;
		
	}
	@Override
	public void registrarMovimientos(int[] mov) {
		this.totalmov = mov;		
		
	}

}
