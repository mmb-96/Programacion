import java.util.Arrays;

/**
 * @author Manuel Melero
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//variables
		ColaTabla colatabla = new ColaTabla();
		ColaLista colalista = new ColaLista();
		
		//Implementacion
		System.out.println("COLA TABLA");
		colatabla.encolan(3);
		colatabla.encolan(4);
		colatabla.encolan(5);
		System.out.println(Arrays.toString(colatabla.getTabla()));
		colatabla.desencolan();
		System.out.println(Arrays.toString(colatabla.getTabla()));
				
		System.out.println("");
		System.out.println("COLA LISTA");
		for (int i = 0; i < 10; i++) {
			colalista.encolan((int) (Math.round(Math.random()*100+1)));
		}
		System.out.println(colalista);
		colalista.desencolan();
		System.out.println(colalista);
	}

}