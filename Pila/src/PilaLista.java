import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Manuel Melero
 *
 */

public class PilaLista extends LinkedList<Integer> implements IPila {

	public PilaLista() {
	}

	@Override
	public void apilar(Integer num) {
		push(num);	
	}

	@Override
	public void desapilar() {
		removeFirst();
	}
	
	public void invertir() {
		Collections.reverse(this);
	}
}