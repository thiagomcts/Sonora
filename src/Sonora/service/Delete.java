package Sonora.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import Sonora.entity.Canciones;

public class Delete {
	
	public static void main(String[] args){
		
		EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("Sonora");
		EntityManager entitymanager= emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Canciones c= entitymanager.find(Canciones.class, 7);
		entitymanager.remove(c);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
		
		
		
	}
	
}
