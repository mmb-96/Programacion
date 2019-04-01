import java.util.Scanner;

/**
 * Implementa un algoritmo en el que dado un entero n > 1 leído por teclado, calcule e imprima los elementos
 * correspondientesa la Conjetura de Ullman (en honor al matemático S. Ullman). La conjetura consiste en lo siguiente:
 * 
 * 	- Empieza con cualquier entero positivo.
 *  - Si es par, se divide entre 2; si es impar se multiplica por 3 se agrega 1.
 *  - Se itera hasta obtener el número 1.
 *  
 *  Al final se obtendrá el número 1, independientemente del entero inicial.
 * 
 * @author Manuel Melero
 */

public class ConjeturaDeUllman {
	
	private static Scanner sx;
	
	public static void main(String[] args) {
		//Variables
		int numero = 0;
		sx = new Scanner(System.in);
		
		//Implementacion
		do {
			System.out.print("Introduzca un numeros: ");
			numero = sx.nextInt();
		} while (numero <= 1 );
		
		System.out.print(numero+" ");
		
		do {
			if (numero%2 == 0) {
				numero/=2;
			}else {
				numero*=3;
				numero+=1;
			}
			System.out.print(numero+" ");
		}while(numero != 1);
		
	}
}