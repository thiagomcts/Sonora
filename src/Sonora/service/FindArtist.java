package Sonora.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Sonora.entity.*;

public class FindArtist {
	
	public static void main(String[] args){
		BufferedReader l=new BufferedReader(new InputStreamReader(System.in));
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Sonora");
		EntityManager entitymanager=emfactory.createEntityManager();
		String a;
		try {
			System.out.println("Ingrese el nombre del artista que desea buscar:");
			a = l.readLine();
			
			String jpql = "SELECT p FROM Artista p WHERE p.anombre = ?1";
	        Query query = entitymanager.createQuery(jpql);
	        query.setParameter(1, a);
	        List<Artista> resultados = query.getResultList(); 
	        
	        for (Artista art : resultados) {
				System.out.println(art.toString());
			}
	        
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Artista no encontrado");
		}
		
	}

}
