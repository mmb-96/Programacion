import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras.
 * El programa nos pedir� la combinaci�n para abrirla. Si no acertamos, se nos mostrar� el mensaje
 * �Lo siento, esa no es la combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Manuel Melero
 */

public class CajaFuerte {

	private static Scanner sx;
	
	public static void main(String[] args) {
		//Variables
		int numero;
		int intentos = 3;
		boolean acierto = false;
		sx = new Scanner(System.in);
				
		//Programacion
		do  {
			System.out.print("Introduzca cuatros numeros seguidos: ");
			numero = sx.nextInt();
			
			if (numero == 4567){
				acierto = true;
				System.out.println("Codigo correcto");
				System.out.print("La caja fuerte se ha abierto satisfactoriamente");
			} else {
				System.out.println("Lo siento, esa no es la combinacn.");
			}
			intentos--;
		} while ((intentos >= 0) && (!acierto));
		
		if (intentos < 0 && !acierto ) {
			System.out.println("No quedan mas intentos.");
		}
	}

}
