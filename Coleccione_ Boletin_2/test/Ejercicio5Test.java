import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio5Test {

	@Test
	public void testFusion() {
	List<Integer> aux = new LinkedList<>();
	Ejercicio5 ejer5 = new Ejercicio5();
	List<Integer> lista1 = new LinkedList<>();
	List<Integer> lista2 = new LinkedList<>();
	lista1.add(1);
	lista1.add(2);
	lista1.add(3);
	lista1.add(4);
	lista2.add(2);
	lista2.add(3);
	lista2.add(5);
	lista2.add(6);
	aux.addAll(lista1);
	aux.addAll(lista2);
	assertEquals(aux, ejer5.fusion(lista1, lista2));

	}

}
