/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Dispositivo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class DispositivoDAO implements IDao<Dispositivo> {

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;

    public DispositivoDAO() {
        
    }

    @Override
    public void save(Dispositivo obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
 
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }
    
    @Override
    public void update(Dispositivo obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }
    

    @Override
    public boolean delete(Dispositivo obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Dispositivo dispositivo = obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Dispositivo WHERE idDispositivo=:idDispositivo ");
        qry.setParameter("idDispositivo", dispositivo.getIdDispositivo());
        qry.executeUpdate(); 
        this.entityManager.getTransaction().commit();
        
        this.entityManager.close();
        return true;
    }

    @Override
    public Dispositivo find(Dispositivo obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Dispositivo dispositivo = obj;
        Dispositivo f = this.entityManager.find(Dispositivo.class, dispositivo.getIdDispositivo());
        this.entityManager.close();
        return f;
    }

    @Override
    public List<Dispositivo> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Dispositivo f ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Dispositivo>) lst;
                
    }

    public Dispositivo findById(Long idDispositivo) { 
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Dispositivo f "
             + " WHERE f.idDispositivo =:idDispositivo ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idDispositivo", idDispositivo);
        
        List<Dispositivo> lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }                
    }    
    
}
