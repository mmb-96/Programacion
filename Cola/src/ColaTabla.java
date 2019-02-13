
/**
 * @author Manuel Melero
 *
 */

public class ColaTabla implements ICola {
	private int nElementos;
	private Integer tabla[];
	
	public ColaTabla() {
		nElementos=0;
		tabla = new Integer[nElementos];
	}
		
	/**
	 * @return the tabla
	 */
	public Integer[] getTabla() {
		return tabla;
	}

	/**
	 * @param tabla the tabla to set
	 */
	public void setTabla(Integer[] tabla) {
		this.tabla = tabla;
	}

	@Override
	public void encolan(Integer num) {
		Integer [] aux = new Integer[nElementos+1];
		for (int i = 0; i < tabla.length; i++) {
			aux[i+1]=tabla[i];
		}
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] == null) {
				aux[i]=num;
			}
		}
		nElementos++;
		tabla=aux;
	}

	@Override
	public void desencolan() {
		Integer [] aux = new Integer[nElementos-1];
		for (int i = 0; i < tabla.length-1; i++) {
			aux[i]=tabla[i];
		}
		nElementos--;
		tabla=aux;
	}
}