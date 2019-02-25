import java.util.ArrayList;


/**
 * @author Manu
 *
 */
public class List extends ArrayList<Alumno>{
	
	public void anadir(Alumno a) {
		this.add(a);
	}

	public String mostrarTodo() {
		return this.toString();
		
	}
	
	public Alumno encuentraAlumno(String dni) {
        for (Alumno al : this) {
            if( al.getDni().equals(dni)) {
                return al;
            }
        }
        return null;

    }
	
	 public int posicion(String dni) {
	      return this.indexOf(encuentraAlumno(dni));
	 }
	 
	 public void modoficar(int posicion,Alumno nuevo) {
	        this.set(posicion, nuevo);
	 }
	 
	public String mostrar(String string) {
		for (Alumno al : this) {
			if(al.getNombre().equals(string)) {
				return al.toString();
			}
		}
		return null;
	}
	
	public String mostrarMod(String matriculados) {
		for (Alumno al : this) {
			if(al.getNombre().equals(matriculados)) {
				return al.getNombre() + " sus modulos son " + al.getModulos();
			} else {
				
			}
		}
		return null;
	}
	
	public String mostrarMatri(String modulo) {
		for (Alumno al : this) {
			if(al.getModulos().contains(modulo)) {
				return "El alumno " + al.getNombre() + " esta matriculado en " + modulo;
			} else {
				
			}
		}
		return null;
	}
	
}