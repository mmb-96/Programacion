import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * 
 */

/**
 * @author Manuel Melero
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables
		boolean bool;
		int dev;
		Set<Integer> aux = new TreeSet<>();
		List<Integer> aux2 = new LinkedList<>();
		List<Character> aux3 = new LinkedList<>();
		TreeSet<Integer> lista1 = new TreeSet<>();
		TreeSet<Integer> lista2 = new TreeSet<>();
		List<Integer> lista3 = new LinkedList<>();
		List<Integer> lista4 = new LinkedList<>();
	
		
		
		//A�adir contenido a las listas.
		//Lista1
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		
		//Lista2
		lista2.add(5);
		lista2.add(6);
		lista2.add(2);
		lista2.add(3);
		
		//Lista3
		lista3.add(1);
		lista3.add(2);
		lista3.add(3);
		lista3.add(4);
		
		//Lista4
		lista4.add(2);
		lista4.add(3);
		lista4.add(5);
		lista4.add(6);
		
		//Implementacion
		//Ejercicio1
		System.out.println("Ejercicio 1 - Uni�n:");
		Ejercicio1 ejer1 = new Ejercicio1();
		aux=ejer1.union(lista1, lista2);
		System.out.println("Union de las dos listas:");
		System.out.println(aux+"\n");
		
		//Ejercicio2
		System.out.println("Ejercicio 2 - Intersecci�n:");
		Ejercicio2 ejer2 = new Ejercicio2();
		aux=ejer2.interseccipn(lista1, lista2);
		System.out.println("Valores repetidos en las dos listas:");
		System.out.println(aux+"\n");
		
		//Ejercicio3
		System.out.println("Ejercicio 3 - Diferencia:");
		Ejercicio3 ejer3 = new Ejercicio3();
		aux=ejer3.diferencia(lista1, lista2);
		System.out.println("Valores no repetidos en las dos listas:");
		System.out.println(aux+"\n");
		
		//Ejercicio4
		System.out.println("Ejercicio 4 - Incluido:");
		Ejercicio4 ejer4 = new Ejercicio4();
		bool=ejer4.incluido(lista1, lista2);
		if (bool) {
			System.out.println("Las dos listas son iguales.\n");
		} else {
			System.out.println("Las dos listas no son iguales.\n");
		}
		
		//Ejercicio5
		System.out.println("Ejercicio 5 - Diferencia:");
		Ejercicio5 ejer5 = new Ejercicio5();
		aux2=ejer5.fusion(lista3, lista4);
		System.out.println("Fusi�n de la dos listas:");
		System.out.println(aux2+"\n");
		
		//Ejercicio6
		System.out.println("Ejercicio 6 - Lee cadena en fichero:");
	    BufferedWriter bw;
        File archivo = new File("Ejercicio6.txt");
		try {
			bw = new BufferedWriter(new FileWriter("Ejercicio6.txt"));
	        bw.write("Ejercicio 6 creado en fichero.");
	        bw.close();
	        Ejercicio6 ejer6 = new Ejercicio6();
	        aux3=ejer6.leeCadena(archivo);
			System.out.println("Lista de carracteres:");
			System.out.println(aux3+"\n");
	        
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero.");
		}
				
		//Ejercicio7
		System.out.println("Ejercicio 7 - Une cadena de fichero:");
	    BufferedWriter bw1;
        File archivo1 = new File("Ejercicio7.txt");
		try {
			bw1 = new BufferedWriter(new FileWriter("Ejercicio7.txt", true));
	        bw1.write("Ejercicio 7 creado un segundo fichero.");
	        bw1.close();
	        Ejercicio7 ejer7 = new Ejercicio7();
	        aux3=ejer7.uneCadenas(archivo, archivo1);
			System.out.println("Lista de carracteres:");
			System.out.println(aux3+"\n");
	        
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero.");
		}
		
		//Ejercicio8
		System.out.println("Ejercicio 8 - Clonacion de fichero:");
		try {
	        Ejercicio8 ejer8 = new Ejercicio8();
	        dev=ejer8.clonaLista(archivo1);
	        if (dev == 1) {
	        	System.out.println("El fichero ha sido clonado");
	        } else {
	        	System.out.println("El fichero no ha sido clonado");
	        }
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero.");
		}
	
	//Ejercicio9
        ListaOrdenada<Integer> ejer9 = new ListaOrdenada<>();
        ejer9.insertarOrdenado(5);
        System.out.println(ejer9);
        ejer9.insertarOrdenado(7);
        System.out.println(ejer9);
        ejer9.insertarOrdenado(23);
        System.out.println(ejer9);
        ejer9.insertarOrdenado(1);
        System.out.println(ejer9);
	}
}
