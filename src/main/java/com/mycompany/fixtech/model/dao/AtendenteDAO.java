/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Atendente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author henry
 */
public class AtendenteDAO implements IDao<Atendente> {

    private EntityManager entityManager;
    
    private TypedQuery<Atendente> qry;
    private String jpql;

    public AtendenteDAO() {
        
    }

    @Override
    public void save(Atendente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }
    
    @Override
    public void update(Atendente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }
    

    @Override
    public boolean delete(Atendente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Atendente atendente = obj;
        this.entityManager.getTransaction().begin();
        qry = (TypedQuery<Atendente>) this.entityManager.createQuery("DELETE FROM Atendente WHERE idUsuario=:idUsuario ");
        qry.setParameter("idUsuario", atendente.getIdUsuario());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        
        this.entityManager.close();
        return true;
    }

    @Override
    public Atendente find(Atendente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Atendente atendente = obj;
        Atendente f = this.entityManager.find(Atendente.class, atendente.getIdUsuario());
        
        this.entityManager.close();
        return f;
    }

    @Override
    public List<Atendente> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Atendente f ";

        qry = (TypedQuery<Atendente>) this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Atendente>) lst;
                
    }

    public Atendente findById(Long idUsuario) { 
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Atendente f "
             + " WHERE f.idUsuario =:idUsuario ";
        qry = (TypedQuery<Atendente>) this.entityManager.createQuery(jpql);
        qry.setParameter("idUsuario", idUsuario);
        
        List<Atendente> lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }                
    }    
    
    public Atendente findByLoginSenha(String login, String senha) {
    this.entityManager = DatabaseJPA.getInstance().getEntityManager();

    jpql = "SELECT a FROM Atendente a WHERE a.login = :login AND a.senha = :senha";
    qry = this.entityManager.createQuery(jpql, Atendente.class);
    
    qry.setParameter("login", login);
    qry.setParameter("senha", senha);

    List<Atendente> resultados = qry.getResultList();

    if (resultados == null || resultados.isEmpty()) {
        return null; 
    }

    return resultados.get(0);
    }
}
