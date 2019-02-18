/**
 * 
 */

/**
 * @author Manu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Piano piano = new Piano();
		piano.add(NotaMusical.Do);
		piano.add(NotaMusical.Re);
		piano.add(NotaMusical.Mi);
		piano.add(NotaMusical.Fa);
		piano.add(NotaMusical.Sol);
		System.out.println(piano.interpretar());
		
		Campana campana = new Campana();
		campana.add(NotaMusical.Do);
		campana.add(NotaMusical.Re);
		campana.add(NotaMusical.Mi);
		campana.add(NotaMusical.Fa);
		campana.add(NotaMusical.Sol);
		campana.add(NotaMusical.Do);
		campana.add(NotaMusical.Re);
		campana.add(NotaMusical.Mi);
		campana.add(NotaMusical.Fa);
		campana.add(NotaMusical.Sol);
		campana.add(NotaMusical.La);
		campana.add(NotaMusical.Si);
		campana.add(NotaMusical.Mi);
		campana.add(NotaMusical.Fa);
		campana.add(NotaMusical.Sol);
		System.out.println(campana.interpretar());

	}

}
