/**
 * Clase Nomina
 */
package Laboral;
/**
 * 
 * @author Manuel Melero
 *
 */
public class Nomina{
	/**
	 * Salario base de los empleado.
	 */
	private static final int SUELDO_BASE[] = {50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};

	/**
	 * 
	 * @param Empleado con el que calcularemos el salario.
	 * @return Develve el salario del empleado
	 */
	public static int sueldo(Empleado ep) {
		int categoria = ep.getCategoria()-1;
		return SUELDO_BASE[categoria]+5000*ep.anyos;
		
	}
}
