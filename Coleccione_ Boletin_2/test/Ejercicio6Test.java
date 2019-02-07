import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

public class Ejercicio6Test {

	@Test
	public void testLeeCadena() throws IOException {
		String cadena;
		LinkedList <Character> listacarracter = new LinkedList <>();
		Ejercicio6 ejer6 = new Ejercicio6();
	    BufferedWriter output;
	    File archivo = new File("Test6.txt");
	
		output = new BufferedWriter(new FileWriter(archivo));
		output.write("Prueba");
		output.close();
	
		BufferedReader input = new BufferedReader(new FileReader(archivo));
		cadena = input.readLine();
		
		for (int i = 0; i< cadena.length(); i++) {
			listacarracter.add(cadena.charAt(i));
		}
		
		input.close();
		
		assertEquals(listacarracter, ejer6.leeCadena(archivo));
	}

}
