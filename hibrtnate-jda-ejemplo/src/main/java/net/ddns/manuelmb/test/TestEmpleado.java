package net.ddns.manuelmb.test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.ddns.manuelmb.modelo.Empleado;

public class TestEmpleado {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("aplicacion");
		manager = emf.createEntityManager();
		
		insertInicial();
		imprimirTodo();
		
		manager.getTransaction().begin();
		Empleado e = manager.find(Empleado.class, 25L);
		e.setNombre("David");
		e.setApellidos("Mulero");
		manager.getTransaction().commit();
		imprimirTodo();
	}

	private static void insertInicial() {
		Empleado a = new Empleado(10L, "Melero", "Manuel", new GregorianCalendar(1996, 2, 6).getTime());
		Empleado b = new Empleado(11L, "Cruz", "José", new GregorianCalendar(2000, 6, 12).getTime());
		
		manager.getTransaction().begin();
		manager.persist(a);
		manager.persist(b);
		manager.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Empleado> empleados =(List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En la base de datos hay " + empleados.size()+ " empleados");
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
		
	}
}
