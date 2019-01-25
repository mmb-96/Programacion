import java.util.Scanner;
/**
 * 
 * @author Manuel
 * @author Juan Manuel
 * @author Oktay
 * @see <a href="https://github.com/mmb-96/Programacion/tree/master/Cadena_Arrays">Repositorio Github Manuel</a>
 */

public class Lista {
	Scanner scs = new Scanner(System.in);
	Scanner sci = new Scanner(System.in);
	private int nAlumnos;
	private Alumnos[] lista;
	
	public Lista(int nAlumnos) {
		this.nAlumnos = nAlumnos;
		this.lista = new Alumnos[nAlumnos];
	}
	

	/**
	 * @return the nAlumnos
	 */
	public int getnAlumnos() {
		return nAlumnos;
	}

	/**
	 * @param nAlumnos the nAlumnos to set
	 */
	public void setnAlumnos(int nAlumnos) {
		this.nAlumnos = nAlumnos;
	}

	/**
	 * @return the comprueba
	 */
	public Alumnos[] getComprueba() {
		return lista;
	}

	/**
	 * @param comprueba the comprueba to set
	 */
	public void setComprueba(Alumnos[] comprueba) {
		this.lista = comprueba;
	}
	
	/*
	 * Metodo para anadir a los alumnos en un array de alumnos
	 * 
	 * */
	
	public void anadirAlumno(Alumnos a) {
		boolean encontrado = false;
		boolean anadido = false;
		for(int i = 0; i < lista.length && encontrado == false; i++) {
			if(lista[i] !=null && a.getNombre() == lista[i].getNombre()) {
				encontrado = true;
				System.out.println("Alumno con el nombre \"" + a.getNombre() + "\" encontrado");				
			}
			
		}
		for(int i = 0; i < lista.length && encontrado == false; i++) {
			if(lista[i] == null && anadido == false) {
				lista[i] = a;
				anadido = true;
			}
		}
		if(anadido) {
			System.out.println("Alumno \"" + a.getNombre() + "\" anadido");			
		}
	}
	
	/*
	 * Buscamos el alumno y si lo encuentra introduce o modifica las notas de los alumnos
	 * 
	 */
	
	
	public void comprobarAlumno() {	
		String nuevoAlumno;
		boolean encontrado = true;
		boolean salir = false;
		do {		
			System.out.println("Introduzca un nombre o fin para acabar: ");
			nuevoAlumno = scs.nextLine();
			for(int i = 0; i < lista.length; i++) {
				if(lista[i] !=null && nuevoAlumno.equals(lista[i].getNombre())) {
					System.out.println("Introduzca " + lista[i].getNotas().length + " notas: ");
					for(int j = 0; j < lista[i].getNotas().length && !salir; j++) {
						lista[i].setNotas(sci.nextInt());
					}
				}else if(!encontrado){
					System.out.println("El alumno no existe");
				}
			} 
		}while(!nuevoAlumno.equals("fin"));
	}
	
	/*
	 * Con este metodo visualizamos a los alumnos en orden alfabetico, con las tres primeras
	 * letras en mayusculas.
	 * Y por ultimo mostrar el numero de alumnos y la nota media del centro.
	 */
	
	public void visualizacion() {
		Alumnos temp;
		String tresnombre;
		String resultado;
		double notaalumno = 0;
		double notacentro = 0;
		int contador = 0;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			resultado = lista[i].getNombre();
			tresnombre = resultado.substring(0, 3).toUpperCase();
			resultado = resultado.substring(3, resultado.length());
			resultado = tresnombre+resultado;
			lista[i].setNombre(resultado);
		}
		
		for (int i = 1; i < lista.length && lista[i] != null; i++) {
			for (int j = i; j > 0; j--) {
				if (lista[j].getNombre().compareTo(lista[j-1].getNombre()) < 0) {
					temp = lista[j];
					lista[j] = lista[j - 1];
					lista[j - 1] = temp;
				}
		    }
		}
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			for (int j = 0; j < lista[i].getNotas().length; j++ ) {
				notaalumno +=lista[i].getNotas()[j];
			}
			contador++;
			notaalumno = notaalumno / lista[i].getNotas().length;
			notacentro += notaalumno;
			System.out.println("La nota media del alumno " + lista[i].getNombre() + " es: " +notaalumno);
			notaalumno=0;
		}
		notacentro = notacentro / contador;
		System.out.println("La centro tiene un total de " + contador + " alumn@s.");
		System.out.println("La nota media del centro es: " + notacentro);
	}
	

}