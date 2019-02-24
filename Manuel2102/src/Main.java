import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */
public class Main {

	/**
	 * @param args
	 */
	private static Scanner sc;
	private static Scanner sx;
	public static void main(String[] args) {
		//Variables
		sc = new Scanner(System.in);
		sx = new Scanner(System.in);
		int opc;
		String tipo;
		String nombre, paisProcedencia;
		int anoNacimiento, posicionRanking;
		boolean caracterProfesional = true, internacional = true;
		Categoria cat = Categoria.Principal;
		ArrayList<Participante> jugador = new ArrayList<>();
		ArrayList<Participante> arbitro = new ArrayList<>();
		Partida pr;
		int[] tm = {1,2,3,4,5};
		
		//Implemantacion
		do {
			System.out.println("1. Alta de participante.");
			System.out.println("2. Inicio de Partida.");
			System.out.println("3. Fin de partida.");
			System.out.println("4. Lista de jugadores");
			System.out.println("5. Estadísticas de un jugador.");
			System.out.println("6. Estadísticas del torneo.");
			System.out.println("7. Salir.\n");
			System.out.print("Seleccione una opcion:");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Jugador o Arbitro");
				tipo = sx.nextLine();
				if (tipo.equalsIgnoreCase("jugador")) {
					System.out.println("Introduce nombre");
					nombre = sx.nextLine();
					System.out.println("Introduce pais procedencia");
					paisProcedencia = sx.nextLine();
					System.out.println("Introduce el año de nacimineto");
					anoNacimiento = sc.nextInt();
					System.out.println("Posicion en el ranking");
					posicionRanking = sc.nextInt();
					Jugador j = new Jugador(nombre, paisProcedencia, anoNacimiento, posicionRanking, caracterProfesional);
					jugador.add(j);
				} else if (tipo.equalsIgnoreCase("arbitro")) {
					System.out.println("Introduce nombre");
					nombre = sx.nextLine();
					System.out.println("Introduce pais procedencia");
					paisProcedencia = sx.nextLine();
					System.out.println("Introduce el año de nacimineto");
					anoNacimiento = sc.nextInt();
					System.out.println("Posicion en el ranking");
					posicionRanking = sc.nextInt();
					Arbitro ar = new Arbitro(nombre, paisProcedencia, anoNacimiento, cat, internacional);
					arbitro.add(ar);
				}
				break;
			case 2:
				Fecha fc = new Fecha(21, "Febrero", 2019);
				pr = new Partida(jugador.get(0), jugador.get(1), arbitro.get(0), fc);
				break;			
			case 3:
				//pr.registrarGanador(Ficha.B);
				//pr.registrarMovimientos(tm);
				break;
			case 4:
				Iterator<Participante> it = jugador.iterator();
				while(it.hasNext()) {
					Jugador pa = (Jugador) it.next();
					System.out.println(pa.getNombre()+"("+pa.isCaracterProfesional()+")");
				}
				
				break;
			case 5:
	
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			}
		}while(opc != 7);

	}

}
