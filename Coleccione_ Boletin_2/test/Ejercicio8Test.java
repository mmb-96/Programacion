import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.junit.Test;

public class Ejercicio8Test {

	@Test
	public void testClonaLista() throws IOException {
		Ejercicio8 ejer8 = new Ejercicio8();
		BufferedWriter bw;
	    File archivo1 = new File("Ejercicio7.txt");
	    bw = new BufferedWriter(new FileWriter(archivo1));
		bw.write("Hola");
		bw.close();
		assertEquals(1, ejer8.clonaLista(archivo1));
	}

}
