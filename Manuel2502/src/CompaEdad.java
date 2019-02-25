import java.util.Comparator;

public class CompaEdad implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
			Alumno A1 = (Alumno)o1;
			Alumno A2 = (Alumno)o2;
		return (A1.getEdad() - A2.getEdad());
	}

}
