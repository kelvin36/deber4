package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entidades.Cliente;
import com.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {
		Pais pais= new Pais("Brasil");
		ingresarPais(pais);
		
		Cliente persona= new Cliente("Kelvin","Matamoros","Mendoza",pais);
		ingresarPersona(persona);
		
		
		
		

		
	}
	static void ingresarPersona(Cliente persona) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarPais(Pais pais) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pais);
		session.getTransaction().commit();
		session.close();

	}
	
	static void imprimirDatos() {
		EntityManager em= emf.createEntityManager();
		Pais pais=em.find(Pais.class, 1);
		
	}
	
	
}