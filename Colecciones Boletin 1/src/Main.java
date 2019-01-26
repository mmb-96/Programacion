import java.util.Scanner;

/**
 * @author Manuel Melero
 *
 */
public class Main {
	private static Scanner sc;
	private static Scanner sn;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables
		int opcion;
		String nombre;
		String frase;
		sc = new Scanner(System.in);
		sn = new Scanner(System.in);
		 
		//Implementacion 
		do {
			System.out.println("1. Lista de numeros no ordenados y ordenados ascendente menores de 100.");
			System.out.println("2. Igual que el anterior, pero con orden descreciente.");
			System.out.println("3. Lista de numeros no ordenados, ordenados decreciente menores de 100 y no repetidos.");
			System.out.println("4. Igual que el anterior, pero con números repetidos y menores de 10.");
			System.out.println("5. Lista de nombres ordenado de forma de inserción y no repetidos.");
			System.out.println("6. Lista de nombres ordenado alfabeticamente y no repetidos.");
			System.out.println("7. Lista de nombre que devuelve una copia sin nombres repetidos.");
			System.out.println("8. Lista de una frese separadas por espacio y muestas las palabras repetida y no repetidas.");
			System.out.println("9. Salir.\n");
			System.out.println("Elige una opcion:");
			opcion = sn.nextInt();
			System.out.println("");
			switch (opcion) {
				case 1:
					Ejercicio1 E1 = new Ejercicio1();
					E1.anadir();
					System.out.println("Lista no ordenada:");
					System.out.println(E1.visualizar()+"\n");
					System.out.println("Lista ordenada:");
					System.out.println(E1.ordenar()+"\n");
					break;
				case 2:
					Ejercicio2 E2 = new Ejercicio2();
					E2.anadir();
					System.out.println("Lista no ordenada:");
					System.out.println(E2.visualizar()+"\n");
					System.out.println("Lista ordenada decreciente:");
					System.out.println(E2.ordenar()+"\n");
					break;
				case 3:
					Ejercicio3 E3 = new Ejercicio3();
					E3.anadir();
					System.out.println("Lista de 20 númenros no repetido:");
					System.out.println(E3.visualizar()+"\n");
					break;
				case 4:
					Ejercicio4 E4 = new Ejercicio4();
					E4.anadir();
					System.out.println("Lista de 20 númenros no repetido:");
					System.out.println(E4.visualizar()+"\n");
					break;
				case 5:
					Ejercicio5 E5 = new Ejercicio5();
					do {
						System.out.println("Introduzca un nombre o la palabra fin: ");
						nombre = sc.nextLine();
						E5.anadir(nombre);
					}while (!nombre.equals("fin"));
					System.out.println("Lista de nombres:");
					System.out.println(E5.visualizar()+"\n");
					break;
				case 6:
					Ejercicio6 E6 = new Ejercicio6();
					do {
						System.out.println("Introduzca un nombre: ");
						nombre = sc.nextLine();
						E6.anadir(nombre);
					}while (!nombre.equals("fin"));
					System.out.println("Lista de nombres o la palabra fin:");
					System.out.println(E6.visualizar()+"\n");
					break;
				case 7:
					Ejercicio7 E7 = new Ejercicio7();
					System.out.println("Introduzca un lista de nombre, si queires terminar escribe fin.");
					do {
						nombre = sc.nextLine();
						E7.anadir(nombre);
					}while (!nombre.equals("fin"));
					System.out.println("Lista de nombres con repetidos:");
					System.out.println(E7.visualizarOriginal()+"\n");
					System.out.println("Lista de nombres sin repetidos:");
					System.out.println(E7.visualizarSinRepetidos()+"\n");
					break;
				case 8:
					Ejercicio8 E8 = new Ejercicio8();
					System.out.println("Introduzca una frase:");
					frase = sc.nextLine();
					E8.anadir(frase);
					System.out.println("Lista de palabras repetidas:");
					System.out.println(E8.visualizarRepetidas()+"\n");
					System.out.println("Lista de palabras no repetidas:");
					System.out.println(E8.visualizarNoRepetidas()+"\n");
					break;
				case 9:
					System.out.println("Saliendo de la aplicación...");
					break;
			}
		}while (opcion != 9);
	}
}