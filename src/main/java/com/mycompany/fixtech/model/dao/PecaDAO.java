/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Peca;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class PecaDAO implements IDao<Peca> {

   private EntityManager entityManager;
    
    private Query qry;
    private String jpql;

    public PecaDAO() {
        
    }

    @Override
    public void save(Peca obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
 
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }
    
   @Override
    public void update(Peca obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }
    

   @Override
    public boolean delete(Peca obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Peca peca = obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Peca WHERE idPeca=:idPeca ");
        qry.setParameter("idPeca", peca.getIdPeca());
        qry.executeUpdate(); 
        this.entityManager.getTransaction().commit();
        
        this.entityManager.close();
        return true;
    }

    @Override
    public Peca find(Peca obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Peca peca = obj;
        Peca f = this.entityManager.find(Peca.class, peca.getIdPeca());
        this.entityManager.close();
        return f;
    }

   @Override
    public List<Peca> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Peca f ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Peca>) lst;
                
    }

    public Peca findById(Long idPeca) { 
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Peca f "
             + " WHERE f.idPeca like :idPeca ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idPeca", idPeca);
        
        List<Peca> lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }                
    }    
}
