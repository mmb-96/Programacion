import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory;

		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		
		Profesor profesor=new Profesor(1, "Juan", "Perez", 33);
		Profesor profesor1=new Profesor(2, "Pepe", "Melero", 23);
		
		//Insert 
		
		session.beginTransaction();
		session.save(profesor);
		session.save(profesor1);
		session.getTransaction().commit();
		
		//Read
		Profesor profesor2=(Profesor)session.get(Profesor.class,1);
		System.out.println(profesor2+"\n");
		Profesor profesor3=(Profesor)session.get(Profesor.class,2);
		System.out.println(profesor3+"\n");
		
		//Update
		profesor1.setNombre("Manuel");
		session.beginTransaction();
		session.update(profesor1);
		session.getTransaction().commit();
		
		//Read
		profesor3=(Profesor)session.get(Profesor.class,2);
		System.out.println(profesor3+"\n");
		
		//Delete
		session.beginTransaction();
		session.delete(profesor);
		session.getTransaction().commit();
		
		//Read
		profesor2=(Profesor)session.get(Profesor.class,1);
		System.out.println(profesor2+"\n");
		
		//Insert and Update
		session.beginTransaction();
		session.saveOrUpdate(profesor);
		session.getTransaction().commit();
		
		//Read
		profesor2=(Profesor)session.get(Profesor.class,1);
		System.out.println(profesor2+"\n");
		
		//Close session
		session.close();
		sessionFactory.close();
	}

}
