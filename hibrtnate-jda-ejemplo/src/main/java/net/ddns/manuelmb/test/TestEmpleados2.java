/**
 * Ralizar que una entidad no administrada, podamos realizar modificaciones y borrado de ella.
 * Volviendo a poner administrada.
 */
package net.ddns.manuelmb.test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.ddns.manuelmb.modelo.Empleado;

public class TestEmpleados2 {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacion");
	
	public static void main(String[] args) {
		
		insertInicial();
	
		EntityManager manager = emf.createEntityManager();
		Empleado b = new Empleado(11L, "Cruz", "José", new GregorianCalendar(2000, 6, 12).getTime());
		
		manager.getTransaction().begin();
		manager.persist(b);
		manager.getTransaction().commit();
		manager.close();
		
		imprimirTodo();
		
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		b.setNombre("Dani");
		manager.merge(b);
		manager.getTransaction().commit();
		manager.close();
		
		imprimirTodo();
		
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		b = manager.merge(b);
		manager.remove(b);
		manager.getTransaction().commit();
		manager.close();
		
		imprimirTodo();
	}

	private static void insertInicial() {
		EntityManager manager = emf.createEntityManager();
		Empleado a = new Empleado(10L, "Melero", "Manuel", new GregorianCalendar(1996, 2, 6).getTime());
		
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		EntityManager manager = emf.createEntityManager();
		List<Empleado> empleados =(List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En la base de datos hay " + empleados.size()+ " empleados");
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
		manager.close();
		
	}
}
