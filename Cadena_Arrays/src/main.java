import java.util.Scanner;
/**
 * 
 * @author Manuel
 * @author Juan Manuel
 * @author Oktay
 * @see <a href="https://github.com/mmb-96/Programacion/tree/master/Cadena_Arrays">Repositorio Github Manuel</a>
 */
public class main {

	public static void main(String[] args) throws Exception{
		Scanner scs = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);
		int modulos;
		String nombre;
		try {
			System.out.println("Introduce la cantidad de alumnos:");
			Lista ar = new Lista(sci.nextInt()); // Introducimos la cantidad de alumnos
			System.out.println("Introduce el nombre del alumno");
			nombre = scs.nextLine();
			System.out.println("Introduce la cantidad de modulos del alumno " + nombre + " : ");
			modulos = sci.nextInt();
			Alumnos a = new Alumnos(nombre, 23, modulos); // Inicimos los alumnos y comprobamos los metodos
			
			System.out.println("Introduce el nombre del alumno");
			nombre = scs.nextLine();
			System.out.println("Introduce la cantidad de modulos del alumno " + nombre + " : ");
			modulos = sci.nextInt();
			Alumnos b = new Alumnos(nombre, 23, modulos);
			
			System.out.println("Introduce el nombre del alumno");
			nombre = scs.nextLine();
			System.out.println("Introduce la cantidad de modulos del alumno " + nombre + " : ");
			modulos = sci.nextInt();
			Alumnos c = new Alumnos(nombre, 23, modulos);
			
			System.out.println("Introduce el nombre del alumno");
			nombre = scs.nextLine();
			System.out.println("Introduce la cantidad de modulos del alumno " + nombre + " : ");
			modulos = sci.nextInt();
			Alumnos d = new Alumnos(nombre, 23, modulos);
			
			System.out.println("Introduce el nombre del alumno");
			nombre = scs.nextLine();
			System.out.println("Introduce la cantidad de modulos del alumno " + nombre + " : ");
			modulos = sci.nextInt();
			Alumnos e = new Alumnos(nombre, 23, modulos);
			

			ar.anadirAlumno(a);
			ar.anadirAlumno(b);
			ar.anadirAlumno(c);
			ar.anadirAlumno(d);
			ar.anadirAlumno(e);
			ar.comprobarAlumno();
			ar.visualizacion();



		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
		sci.close();
		scs.close();
	}
	

}
