import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
	private static Scanner sc;
	public static void main(String[] args) {
		String opc;
		sc = new Scanner(System.in);
		ArrayList<String> modulo = new ArrayList<String>();
		List listaAlumno =  new List();
		do {
			System.out.println("1. Añadir alumnos");
			System.out.println("2. Mostrar alumnos");
			System.out.println("3. Eliminar alumnos");
			System.out.println("4. Mostrar todos los alumnos del ciclo");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opcion:");
			opc = sc.nextLine();
			switch (opc) {
			case "opc1":
				do {
					System.out.println("1. Dar de alta con todos los datos");
					System.out.println("2. Dar de alta con datos obligatorios");
					System.out.println("3. Modificar o añadir datos de un alumno.");
					System.out.println("4. Salir");
					System.out.print("Seleccione una opcion:");
					opc = sc.nextLine();
					switch (opc) {
					case "opc1":
						modulo.add("ED");
						modulo.add("SI");
						Alumno alumno = new Alumno("Manuel", "Melero", "30235421N", 23, modulo, "Everis");
						listaAlumno.anadir(alumno);
						break;
					case "opc2":
						Alumno alumno1 = new Alumno("Pepe", "Peréz", "30235420A");
						listaAlumno.anadir(alumno1);
						break;
					case "opc3":
						System.out.println(listaAlumno.mostrarTodo());
						System.out.println("Introduzca el dni del alumno a modificar");
						String dnia = sc.nextLine();
						listaAlumno.modoficar(listaAlumno.posicion(dnia), new Alumno("Pepito", "Benitez", "3335253A"));
						break;
					case "salir":
						break;
					}
				}while(!opc.equals("salir"));
				break;
			case "opc2":
				do {
					System.out.println("1. Muestra los datos personales de un alumno");
					System.out.println("2. Muestra el nombre de un alumno y los modulos en los que esta matriculado.");
					System.out.println("3. Muestra los alumnos matriculados en un modulo previamente especificado.");
					System.out.println("4. Salir");
					System.out.print("Seleccione una opcion:");
					opc = sc.nextLine();
						switch (opc) {
						case "opc1":
							System.out.println(listaAlumno.mostrar("Manuel"));
							break;
						case "opc2":
							System.out.println(listaAlumno.mostrarMod("Manuel"));
							break;
						case "opc3":
							System.out.println(listaAlumno.mostrarMatri("SI"));
							break;
						case "salir":
							break;
						}
				}while(!opc.equals("salir"));
				break;
			case "opc3":
				do {
					System.out.println("1. Elimina un alumno por dni");
					System.out.println("2. Elimina un alumno por nombre");
					System.out.println("3. Elimina todos alumnos por modulo");
					System.out.println("4. Salir");
					System.out.print("Seleccione una opcion:");
					opc = sc.nextLine();
						switch (opc) {
						case "opc1":
							listaAlumno.remove(listaAlumno.encuentraAlumno("30235420A"));
							break;
						case "opc2":
							listaAlumno.remove(listaAlumno.mostrar("Manuel"));
							break;
						case "opc3":
							listaAlumno.remove(listaAlumno.mostrarMatri("SI"));
							break;
						case "salir":
							break;
						}
				}while(!opc.equals("salir"));
				break;
			case "opc4":
				do {
					System.out.println("1. Mostrar todos los alumnos sin filtro");
					System.out.println("2. Mostrar todos los alumnos matriculados en un modulo previamente especificado.");
					System.out.println("3. Mostrar todos los alumnos por edad");
					System.out.println("4. Salir");
					System.out.print("Seleccione una opcion:");
					opc = sc.nextLine();
						switch (opc) {
						case "opc1":
							System.out.println(listaAlumno.mostrarTodo());
							break;
						case "opc2":
							System.out.println(listaAlumno.mostrarMatri("SI"));
							break;
						case "opc3":
							Collections.sort(listaAlumno, new CompaEdad());
							break;
						case "salir":
							break;
						}
				}while(!opc.equals("salir"));
				break;
			case "fin":
				break;
			}
		}while(!opc.equals("fin"));
	}
}