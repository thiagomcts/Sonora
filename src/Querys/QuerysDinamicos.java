package Querys;

import java.util.List; 

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.EntityTransaction; 
import javax.persistence.Persistence; 
import javax.persistence.Query;
import Sonora.entity.Canciones;

public class QuerysDinamicos { 

    public static void main(String[] args) { 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sonora"); 
        EntityManager em = emf.createEntityManager(); 
         
        String jpql = "SELECT p FROM Canciones p WHERE p.creproducciones > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, 5);
        List<Canciones> resultados = query.getResultList(); 
        for(Canciones p : resultados) { 
        	 System.out.print("Cancion id :" + p.getCid( ));
             System.out.println("\t Nombre Cancion :" + p.getCnombre());
        } 
         
        em.close(); 
        emf.close(); 
    } 
 
}
