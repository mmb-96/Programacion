
/**
 * 
 */

/**
 * @author Manu
 *
 */
public abstract class Instrumento {
	private static int TAMANO_MAXIMO = 100;
	private NotaMusical notas [];
	private int numNota;

	/**
	 * 
	 */
	public Instrumento() {
		notas = new NotaMusical[TAMANO_MAXIMO];
		numNota = 0;
	}
	
	public void add(NotaMusical nota) {
		if (numNota < notas.length) {
			notas[numNota] = nota;
			numNota++;
		}
	}
	
	public abstract String interpretar();

	/**
	 * @return the notas
	 */
	public Object[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(NotaMusical[] notas) {
		this.notas = notas;
	}

	/**
	 * @return the numNota
	 */
	public int getNumNota() {
		return numNota;
	}

	/**
	 * @param numNota the numNota to set
	 */
	public void setNumNota(int numNota) {
		this.numNota = numNota;
	}
	
	
}
