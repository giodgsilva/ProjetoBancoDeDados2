package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<E> {
	
    protected EntityManager entityManager;
	 
    public AbstractDAO() {
        entityManager = getEntityManager();
    }
 
    private EntityManager getEntityManager() {
        
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate-example");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
 
    public abstract ArrayList<E> listarTodos();
 
    public boolean salvar(E object) {
    	
    	boolean resultado = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
            resultado = false;
        }
        
        return resultado;
    }
 
    public boolean merge(E object) {
    	
    	boolean resultado = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            resultado = false;
        }
        
        return resultado;
    }
 
    public boolean remover(E object) {
    	
    	boolean resultado = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            resultado = false;
        }
        
        return resultado;
    }
    
    public abstract E getLong(final Long id);
    
    public abstract boolean removerLong(final Long id);
	
}
