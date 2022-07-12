package fr.diginamic.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo-pu");
    	EntityManager em = entityManagerFactory.createEntityManager();
    	
    	System.out.println(em);
    	
    	em.close();
    	entityManagerFactory.close();        
    }
}
