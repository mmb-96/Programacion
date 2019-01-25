/**
 * 
 * @author Manuel
 * @author Juan Manuel
 * @author Oktay
 * @see <a href="https://github.com/mmb-96/Programacion/tree/master/Cadena_Arrays">Repositorio Github Manuel</a>
 */
public class Alumnos {
	
	private String nombre;
	private int edad;
	private int [] notas;
	
	
	public Alumnos(String nombre, int edad, int modulos) {
		this.nombre = "";
		this.edad = 0;
		this.notas = new int[modulos];
		setNombre(nombre);
		setEdad(edad);

	}
	
	public Alumnos() {
		super();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;	
	}
	
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if(edad < 0) {
			throw new IllegalArgumentException("Edad inferior a 0");
		}else {
			this.edad = edad;
		}
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int valor) {
		boolean anadido = false;
		if(valor < 0 || valor > 10) {
			throw new IllegalArgumentException("Notas invalidas. Entre 0 y 10");
		}else {
			for(int i = 0; i < notas.length && !anadido ; i++) {
				if(notas[i] == 0) {
					notas[i] = valor;
					anadido = true;
				}
			}
		}
	}

	
	
}
