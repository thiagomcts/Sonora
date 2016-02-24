package Sonora.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Sonora.entity.*;

public class Update {
	public static void main(String[] args){
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Sonora");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Canciones canciones=entitymanager.find(Canciones.class, 1);
		
		//Antes de actualizar
		System.out.println(canciones);
		canciones.setCdescargas(30);
		entitymanager.getTransaction().commit();
		
		//Despues de actualizar
		System.out.println(canciones);
		entitymanager.close();
		emfactory.close();
		
	}
}
