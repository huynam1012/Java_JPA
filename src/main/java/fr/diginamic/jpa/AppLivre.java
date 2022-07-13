package fr.diginamic.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AppLivre {
	
	public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-hnt");
    	EntityManager em = entityManagerFactory.createEntityManager();
    	System.out.println("connection ok : " + em);
    	
    	//em.getTransaction().begin();

    	/**Livre livre1 = new Livre(7, "aaaa", "J. K. Rowling-test");
    	em.persist(livre1);*/
    	//System.out.println("livre inséré : " + livre1.toString());
    	
    	/**Livre livre2 = em.find(Livre.class, 7);
    	System.out.println(livre2);
    	livre2.setTitre("Du plaisir dans la cuisine");*/
    
    	//em.getTransaction().commit();

    	TypedQuery<Livre> findAllQuery = em.createQuery("from Livre", Livre.class);
    	List<Livre> livres = findAllQuery.getResultList();
    	
    	for (Livre livre : livres) {
			System.out.println(livre);
		}

    	TypedQuery<Livre> findByTitle = em.createQuery("select l from Livre l where l.titre = :titre", Livre.class);
    	TypedQuery<Livre> findByAuteur = em.createQuery("select l from Livre l where l.auteur = :auteur", Livre.class);
    	System.out.println(findByAuteur.setParameter("auteur", "Jules Verne").getSingleResult());
    	System.out.println("-----------------------");
    	System.out.println(findByTitle.setParameter("titre", "Harry Potter").getSingleResult());
    	
    	
    	em.close();
    	entityManagerFactory.close();  
    }

}
