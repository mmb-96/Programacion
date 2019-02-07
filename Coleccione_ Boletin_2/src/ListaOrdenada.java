import java.util.Comparator;
import java.util.LinkedList;

/**
 * 9. Definir una clase ListaOrdenada que herede de LinkedList
 * y permita la inserci�n ordenada. Codificar un m�todo que
 * inserte un nuevo elemento con el prototipo: 
 * void insertarOrdenado(E elemento)
 */

/**
 * @author Manuel Melero
 *
 */
public class ListaOrdenada<E> extends LinkedList<E> implements Comparator<E>{
	/**
	 * 
	 */
	public ListaOrdenada() {
		super();
	}

	
	public void insertarOrdenado(E elemento) {
		int indicador = 0;
		boolean anadido = false;
		if (size() == 0) {
			add(elemento);
		} else {
			do {
				if (this.compare((get(indicador)), elemento) == -1){
					indicador++;
					if (indicador >= size()) {
						addLast(elemento);
						anadido = true;
					}
				} else {
					add(indicador, elemento);
					anadido = true;
				}
			} while (!anadido && indicador < size());
		}
	}

	@Override
	public int compare(E ob1, E ob2) {
		if((int)ob1 < (int)ob2) {
            return -1;
        }else if((int)ob1 > (int)ob2) {
            return 1;
        }else {
            return 0;
        }
	}

}
