import java.util.Scanner;

/**
 * Realizar el juego el número secreto, que consiste en acertar un número desconocido (generado aleatoriamente (entre 1 y 100).
 * Para ello se leen por teclado una serie de números, para los que se indica: «mayor» o «menor», según sea mayor o menor con
 * respecto al número secreto. El proceso termina cuando el usuario acierte o cuando se rinde (introduciendo un - 1). 
 * 
 * @author Manuel Melero
 */

public class NumeroSecreto {
	
	private static Scanner sx;

	public static void main(String[] args) {
		//Variables
		int numeroAcertar = (int) (Math.random()*100+1);
		int numero;
		boolean salir = false;
		sx = new Scanner(System.in);
		
		//Programacion
		do {
			System.out.print("Introduzca un numeros: ");
			numero = sx.nextInt();
				if (numero < numeroAcertar) {
					System.out.println("Mayor");
				} else if (numero > numeroAcertar) {
					System.out.println("Menor");
				}
				if (numero == -1) {
					salir = true;
					System.out.println("Lo siento, el numero era: " + numeroAcertar);
				}else if (numero == numeroAcertar) {
					salir = true;
					System.out.println("Numero Acertado.");
				}
		}while (!salir);
	}
}