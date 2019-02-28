import java.util.Scanner;

/**
 * Main de la apliacion para la cafeteria del centro.
 * @author Manuel Melero
 *
 */
public class Main {
	
	private static Scanner sc;
	private static Scanner sx;
	private static Fichero fh;
	private static BD bd;
	/**
	 * @param args
	 */
	public static void main(String[] args){
		//variables
		ListaCliente lisCliente = new ListaCliente();
		ListaCliente lisClienteBD = new ListaCliente();
		ListaCliente lisClienteFich = new ListaCliente();
		int opc;
		int num;
		bd = new BD();
		fh = new Fichero();
		sc = new Scanner(System.in);
		sx = new Scanner(System.in);
		
		//implementacion
		
		//obtiene los clientes de la base de datos
		lisClienteBD=bd.leer();
		if (lisClienteBD.size() > 0 ) {
			System.out.println("Los clientes de la base de datos son:");
			lisCliente.addAll(lisClienteBD);
			System.out.println(lisClienteBD.toString()+"\n");
		} else {
			System.out.println("La base de datos esta vacia.\n");
		}
		
		//obtiene los clientes del fichero
		lisClienteFich=fh.leer();
		
		if (lisClienteFich.size() > 0 ) {
			System.out.println("Los clientes del fichero son:");
			lisCliente.addAll(lisClienteFich);
			System.out.println(lisClienteFich.toString()+"\n");
		} else {
			System.out.println("No existe ningun fichero o no tiene ningun dato.\n");
		}
		
		//muestra todos los clientes obtenidos de la base de datos y del fichero.
		System.out.println("Los clientes son:");
		System.out.println(lisCliente.toString()+"\n");

		//bucle del menu.
		do {
			System.out.println("1. Anadir nuevo cliente.");
			System.out.println("2. Modificar datos.");
			System.out.println("3. Dar de baja un cliente.");
			System.out.println("4. Listar los clientes.");
			System.out.println("5. Salir.");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				lisCliente.anadir(new Cliente("Manuel", "Melero Benitez", 608707624));
				lisCliente.anadir(new Cliente("Rafael", "Mulero Perez", 679395696));
				System.out.println(lisCliente.toString());
				break;
			case 2:
				Cliente cliMod;
				System.out.println("Introduzca el ID a modificar");
				num = sc.nextInt();
				cliMod = lisCliente.modificar(num);
				System.out.println(cliMod.toString());
				//bucle submenu
				do {
					System.out.println("1. Modificar nombre.");
					System.out.println("2. Modificar apellidos.");
					System.out.println("3. Modificar telefono.");
					System.out.println("4. salir.");
					opc = sc.nextInt();
					switch (opc) {
					case 1:
						System.out.print("Escribe el nuevo nombre:");
						String nombre = sx.nextLine();
						cliMod.setNombre(nombre);
						System.out.println(cliMod.toString());
						break;
					case 2:
						System.out.print("Escribe los nuevos apellidos:");
						String apellidos = sx.nextLine();
						cliMod.setApellidos(apellidos);
						System.out.println(cliMod.toString());
						break;
					case 3:
						System.out.print("Escribe el nuevo numero de telefono:");
						int telefono = sc.nextInt();
						cliMod.setTelefono(telefono);
						System.out.println(cliMod.toString());
					case 4:
						System.out.println("Saliendo del submenu...");
						break;
					default:
						System.out.println("Opcion incorrecta o cliente no enontrado");
						break;
					}
				} while (opc != 4);
				break;
			case 3:
				System.out.println(lisCliente.toString());
				System.out.println("Introduzca el ID del cliente que quieres eliminar");
				num = sc.nextInt();
				if(lisCliente.eliminar(num) == 1) {
					System.out.println("El cliente se ha sido eliminado correctamente");
				} else {
					System.out.println("El cliente no se ha podido eliminar");
				}
				break;
			case 4:
				System.out.println(lisCliente.toString());
				break;
			case 5:
				//eliminar datos de la base de datos.
				bd.elinimar();
				//eliminar datos del fichero.
				fh.elinimar();
				String cadena;
				//guarda los datos en el fichero
				for (Cliente c : lisCliente) {
					cadena = c.getNombre() + "," + c.getApellidos() + "," + c.getTelefono();
					if (fh.guardar(cadena) != false) {
						System.out.println("Se ha producido un error, posiblemente el fichero no exista.");
					}
				}
				//guarda los datos en la DDBB
				for (Cliente c : lisCliente) {
					cadena = c.getIdCliente() + "," + c.getNombre() + "," + c.getApellidos() + "," + c.getTelefono();
					if (bd.guardar(cadena) != false) {
						System.out.println("Se ha producido un error, con la base de datos.");
					}
				}
				System.out.println("Guardando los cambios y saliendo de la aplicacion...");
				break;
			default:
				System.out.println("Numero introducido no correcto");
				break;
			}
		} while (opc != 5);
	}
}