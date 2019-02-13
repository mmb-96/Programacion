import java.util.LinkedList;

/**
 * @author Manuel Melero
 *
 */

public class ColaLista extends LinkedList<Integer> implements ICola {

	public ColaLista() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encolan(Integer num) {
		push(num);
	}

	@Override
	public void desencolan() {
		removeLast();
	}
}