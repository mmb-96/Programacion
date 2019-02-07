import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Ejercicio1Test {

	@Test
	public void testUnion() {
		TreeSet<Integer> lista1 = new TreeSet<>();
		TreeSet<Integer> lista2 = new TreeSet<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		
		lista2.add(5);
		lista2.add(6);
		lista2.add(2);
		lista2.add(3);
		
		Set<Integer> aux = new TreeSet<>();
		aux.addAll(lista1);
		aux.addAll(lista2);
		Ejercicio1 ejer1 = new Ejercicio1();
		assertEquals(aux, ejer1.union(lista1, lista2));
	}

}
