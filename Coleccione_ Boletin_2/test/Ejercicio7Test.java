import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

public class Ejercicio7Test {

	@Test
	public void testUneCadenas() throws IOException {
		String cadena;
		String cadena1;
		LinkedList <Character> listacarracter = new LinkedList <>();
		Ejercicio7 ejer7 = new Ejercicio7();
		
		BufferedWriter bw1;
	    File archivo1 = new File("Ejercicio7.txt");
	    bw1 = new BufferedWriter(new FileWriter(archivo1));
		bw1.write("Hola");
		bw1.close();
		
		BufferedWriter bw2;
	    File fichero2 = new File("Ejercicio7.1.txt");
	    bw2 = new BufferedWriter(new FileWriter(fichero2));
	    bw2.write("Cacacola");
	    bw2.close();
		
		BufferedReader bfr = new BufferedReader(new FileReader(archivo1));
		cadena = bfr.readLine();
		BufferedReader bfr1 = new BufferedReader(new FileReader(fichero2));
		cadena1 = bfr1.readLine();
		
		for (int i = 0; i< cadena.length(); i++) {
			listacarracter.add(cadena.charAt(i));
		}
		for (int i = 0; i<cadena1.length(); i++) {
			listacarracter.add(cadena1.charAt(i));
		}
		
		bfr.close();
		bfr1.close();
		
		assertEquals(listacarracter, ejer7.uneCadenas(archivo1, fichero2) );

	}

}
