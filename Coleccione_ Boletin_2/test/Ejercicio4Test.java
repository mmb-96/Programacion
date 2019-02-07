import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Ejercicio4Test {

	@Test
	public void testIncluido() {
		TreeSet<Integer> lista1 = new TreeSet<>();
		TreeSet<Integer> lista2 = new TreeSet<>();
		lista1.add(1);
		lista2.add(1);
		Set<Integer> lista3 = new TreeSet<>();
		lista3.add(2);
		Ejercicio4 ejer4 = new Ejercicio4();
		assertTrue(ejer4.incluido(lista1, lista2));
		assertFalse(ejer4.incluido(lista3, lista2));
	}

}
