import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cliente [] clientes = new Cliente [5];
		
		clientes[0] = new Cliente("30235421N", "Manuel", 23, 2600);
		clientes[1] = new Cliente("789456123K", "Ana", 48, 8000);
		clientes[2] = new Cliente("30235421N", "Beatriz", 23, 10000);
		clientes[3] = new Cliente("28599059A", "Pepe", 16, 260);
		clientes[4] = new Cliente("001469753J", "Andes", 23, 5325);
		
		System.out.println(clientes[0].equals(clientes[2]));
		System.out.println(clientes[1].equals(clientes[2]));
		
		Arrays.sort(clientes);
		System.out.println("Ordenado por DNI:\n" + Arrays.toString(clientes));
		
		Arrays.sort(clientes, new CompaNombre());
		System.out.println("Ordenado por nombre:\n" + Arrays.toString(clientes));
		
		Arrays.sort(clientes, new CompaEdad());
		System.out.println("Ordenado por edad:\n" + Arrays.toString(clientes));
	}
}