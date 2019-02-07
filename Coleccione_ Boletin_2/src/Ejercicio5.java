import java.util.LinkedList;
import java.util.List;

/**
 * 5. Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva
 * una única lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no
 * destructiva, es decir, que las listas utilizadas como parámetros de entrada se
 * mantengan intactas: List<Integer> fusion(List<Integer> lista1, List<Integer> lista2)
 */

/**
 * @author Manuel Melero
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> fusion(List<Integer> lista1, List<Integer> lista2){
		List<Integer> listafun = new LinkedList<>();
		listafun.addAll(lista1);
		listafun.addAll(lista2);
		return listafun;
	}

}
