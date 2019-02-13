import java.util.Arrays;
import java.util.Scanner;

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
		PilaTabla pilatabla = new PilaTabla();
		PilaLista pilalista = new PilaLista();
		int cont = 0 ;
		Integer num;
		Scanner sc = new Scanner(System.in);
		//Implementacion
		System.out.println("PILA TABLA");
		System.out.println("");
		pilatabla.apilar(3);
		pilatabla.apilar(4);
		pilatabla.apilar(5);
		System.out.println(Arrays.toString(pilatabla.getTabla()));
		pilatabla.desapilar();
		System.out.println(Arrays.toString(pilatabla.getTabla()));
		
		System.out.println("");
		System.out.println("PILA LISTA");
		System.out.println("");
		
		System.out.println("Intoruzca diez numeros:");
		while (cont < 10) {
			num=sc.nextInt();
			pilalista.apilar(num);
			cont++;
		}
		System.out.println(pilalista);
		pilalista.invertir();
		System.out.println(pilalista);
		pilalista.desapilar();
		System.out.println(pilalista);
		
		sc.close();
	}

}
