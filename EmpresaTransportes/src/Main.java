
public class Main {

	public static void main(String[] args) {
		Etiqueta eti = new Etiqueta("Manuel Melero", "C/ Sevilla Eminencia Nº 107", 41006, "Sevilla");
		Caja caja1 = new Caja(3, 6, 5, Unidad.M, eti);
		
		System.out.println("El volumen da la caja es " + caja1.getVolumen() + " metos cuadraros.");
		System.out.println(caja1.toString()+"\n");
		Caja caja2 = new Caja(300, 800, 700, Unidad.CM, eti);
		
		System.out.println("El volumen da la caja es " + caja2.getVolumen() + " metos cuadraros.");
		System.out.println(caja2.toString());


	}

}
