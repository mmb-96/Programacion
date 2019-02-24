/**
 * Entidad administrada global.
 */
package net.ddns.manuelmb.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.ddns.manuelmb.modelo.Direccion;
import net.ddns.manuelmb.modelo.Empleado;

public class TestEmpleado {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacion");
	
	public static void main(String[] args) {
		manager = emf.createEntityManager();
		
		insertInicial();
		
		imprimirTodo();
		manager.getTransaction().begin();
		Empleado e = manager.find(Empleado.class, 11L);
		e.setNombre("David");
		e.setApellidos("Mulero");
		manager.getTransaction().commit();
		imprimirTodo();
		
		manager.close();
	}

	private static void insertInicial() {
		
		Empleado a = new Empleado(10L, "Melero", "Manuel", LocalDate.of(1996, Month.FEBRUARY, 6));
		Empleado b = new Empleado(11L, "Cruz", "José", LocalDate.of(2000, 10, 6));
		a.setDireccion(new Direccion(15L, "Calle Costa Y Llobera, 107", "Sevilla", "Sevilla", "España"));
		b.setDireccion(new Direccion(16L, "Calle Falsa, 123", "Leganes", "Madrid", "España"));
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
