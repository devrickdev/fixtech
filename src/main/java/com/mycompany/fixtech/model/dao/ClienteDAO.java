/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.exceptions.LoginException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class ClienteDAO implements IDao<Cliente> {

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;

    public ClienteDAO() {
        
    }

    @Override
    public void save(Cliente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }
    
    @Override
    public void update(Cliente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }
    

    @Override
    public boolean delete(Cliente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager(); 
        Cliente cliente = obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Cliente WHERE idUsuario=:idUsuario ");
        qry.setParameter("idUsuario", cliente.getIdUsuario());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        
        this.entityManager.close();
        return true;
    }

    @Override
    public Cliente find(Cliente obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Cliente cliente = obj;
        Cliente f = this.entityManager.find(Cliente.class, cliente.getIdUsuario());
        this.entityManager.close();
        return f;
    }

    @Override
    public List<Cliente> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Cliente f ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Cliente>) lst;
                
    }

    public Cliente findById(Long idUsuario) { 
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT f "
             + " FROM Cliente f "
             + " WHERE f.idUsuario =:idUsuario ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idUsuario", idUsuario);
        
        List<Cliente> lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }                
    }    
    
    public Cliente findByLoginSenha(String login, String senha) {
    this.entityManager = DatabaseJPA.getInstance().getEntityManager();

    jpql = "SELECT a FROM Cliente a WHERE a.login = :login AND a.senha = :senha";
    qry = this.entityManager.createQuery(jpql);
    
    qry.setParameter("login", login);
    qry.setParameter("senha", senha);

    try {
        return (Cliente) qry.getSingleResult();
    } catch (LoginException e) {
        return null;
    }
}
    
}
