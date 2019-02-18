import java.util.Arrays;

/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Campana extends Instrumento {

	public Campana() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String interpretar() {
		return Arrays.toString(getNotas());
	}

}
