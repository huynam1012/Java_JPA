package fr.diginamic.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestBibliotheque {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-hnt");
    	EntityManager em = entityManagerFactory.createEntityManager();
    	System.out.println("connection ok : " + em);
    	
    	Emprunt emprunt = em.find(Emprunt.class, 1);
    	System.out.println("Emprunt est: " + emprunt);
    	
    	TypedQuery<Livre> query = em.createQuery("from Livre", Livre.class);
    	List<Livre> livres = query.getResultList();
    	
    	
		for (Livre livre : emprunt.getLivres()) {
			System.out.println(livre);
		}
		
		
		em.close();
		entityManagerFactory.close();
		
	}

}
