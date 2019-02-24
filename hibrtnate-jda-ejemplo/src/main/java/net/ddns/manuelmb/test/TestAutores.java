package net.ddns.manuelmb.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.ddns.manuelmb.modelo.Autor;
import net.ddns.manuelmb.modelo.Libro;

public class TestAutores {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacion");
	
	public static void main(String[] args) {
		crearDatos();
		imprimirDatos();

	}

	private static void crearDatos() {
		EntityManager manager = emf.createEntityManager();
		Autor autor1 = new Autor(1L, "Pablo Pérez", "Española");
		Autor autor2 = new Autor(2L, "Elena Gómez", "Mexicano");
		Autor autor3 = new Autor(3L, "Miguel López", "Chileno");
		
		manager.getTransaction().begin();
		manager.persist(autor1);
		manager.persist(autor2);
		manager.persist(autor3);
		
		manager.persist(new Libro(1L, "Programar en Java es fácil", autor2));
		manager.persist(new Libro(2L, "Cómo vestirse con estilo", autor3));
		manager.persist(new Libro(3L, "Cómo cocinar sin quemar la cocina", autor1));
		manager.persist(new Libro(4L, "Programar en Cobol es divertido", autor2));
		manager.persist(new Libro(5L, "Programar en Cobol no es divertido", autor2));
		manager.getTransaction().commit();
		manager.close();
	}
	
	private static void imprimirDatos() {
		EntityManager manager = emf.createEntityManager();
		
		Autor autor1 = manager.find(Autor.class, 1L);
		List<Libro> libros1 = autor1.getLibros();
		System.out.println(autor1);
		for (Libro lib : libros1) {
			System.out.println("* "+ lib.toString());
		}
		Autor autor2 = manager.find(Autor.class, 2L);
		List<Libro> libros2 = autor2.getLibros();
		System.out.println(autor2);
		for (Libro lib : libros2) {
			System.out.println("* "+ lib.toString());
		}
		Autor autor3 = manager.find(Autor.class, 3L);
		List<Libro> libros3 = autor3.getLibros();
		System.out.println(autor3);
		for (Libro lib : libros3) {
			System.out.println("* "+ lib.toString());
		}
		manager.close();
	}

}
