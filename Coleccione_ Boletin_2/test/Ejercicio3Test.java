import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Ejercicio3Test {

	@Test
	public void testDiferencia() {
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
		Iterator<Integer> it = lista1.iterator();
		Integer temp;
		while (it.hasNext()) {
			temp = it.next();
			if (!lista2.contains(temp)) {
				aux.add(temp);
			}
		}
		Ejercicio3 ejer3 = new Ejercicio3();
		assertEquals(aux, ejer3.diferencia(lista1, lista2));
	}

}
