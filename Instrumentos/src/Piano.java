import java.util.Arrays;

/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Piano extends Instrumento{

	/**
	 * 
	 */
	public Piano() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String interpretar() {
		return Arrays.toString(getNotas());
	}
}
