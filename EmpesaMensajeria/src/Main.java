
public class Main {

	public static void main(String[] args) {
		Etiqueta eti = new Etiqueta(305 ,"Manuel Melero", "C/ Sevilla Eminencia Nº 107", 41006, "Sevilla");
		CajaCarton caja1 = new CajaCarton(300, 800, 700, eti);
		
		System.out.println("El area da la caja es " + caja1.getArea() + " centrimetros cuadraros.");
		System.out.println("El volumen da la caja es " + caja1.getVolumen() + " metos cuadraros.");
		System.out.println(caja1.toString()+"\n");
		System.out.println("La superficie de carton utilizado por la empresa es " + CajaCarton.getsuperficieTotal() + " en centimetros cuadrados\n");
		
		Etiqueta eti2 = new Etiqueta(308 ,"Pepe Sanchez", "C/ Sevilla Nº 2", 41012, "Sevilla");
		CajaCarton caja2 = new CajaCarton(200, 620, 540, eti2);
		
		System.out.println("El area da la caja es " + caja2.getArea() + " centrimetros cuadraros.");
		System.out.println("El volumen da la caja es " + caja2.getVolumen() + " metos cuadraros.");
		System.out.println(caja2.toString()+"\n");
		System.out.println("La superficie de carton utilizado por la empresa es " + CajaCarton.getsuperficieTotal()+"\n");
		
		


	}
}