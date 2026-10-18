/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Feedback;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class FeedbackDAO implements IDao<Feedback> {

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;

    public FeedbackDAO() {
        
    }

    @Override
    public void save(Feedback obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
 
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }
    
    @Override
    public void update(Feedback obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }
    

    @Override
    public boolean delete(Feedback obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Feedback feedback = obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Feedback WHERE idFeedback=:idFeedback ");
        qry.setParameter("idFeedback", feedback.getIdFeedback());
        qry.executeUpdate(); 
        this.entityManager.getTransaction().commit();
        
        this.entityManager.close();
        return true;
    }

    @Override
    public Feedback find(Feedback obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Feedback feedback = obj;
        Feedback f = this.entityManager.find(Feedback.class, feedback.getIdFeedback());
        this.entityManager.close();
        return f;
    }

    @Override
    public List<Feedback> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Feedback f ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Feedback>) lst;
                
    }

    public Feedback findById(Long idFeedback) { 
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Feedback f "
             + " WHERE f.idFeedback =:idFeedback ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idFeedback", idFeedback);
        
        List<Feedback> lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }                
    }    
    
}
