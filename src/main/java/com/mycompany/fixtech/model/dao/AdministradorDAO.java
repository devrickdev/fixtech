/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Administrador;
import com.mycompany.fixtech.model.exceptions.LoginException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class AdministradorDAO implements IDao<Administrador> {

    private EntityManager entityManager;

    private Query qry;
    private String jpql;

    public AdministradorDAO() {

    }

    @Override
    public void save(Administrador obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
    }

    @Override
    public void update(Administrador obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        this.entityManager.getTransaction().begin();
        this.entityManager.merge(obj);
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
    }

    @Override
    public boolean delete(Administrador obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Administrador WHERE idUsuario=:idUsuario ");
        qry.setParameter("idUsuario", obj.getIdUsuario());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
        return true;
    }

    @Override
    public Administrador find(Administrador obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Administrador f = this.entityManager.find(Administrador.class, obj.getIdUsuario());

        this.entityManager.close();
        return f;
    }

    @Override
    public List<Administrador> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        jpql = " SELECT f "
                + " FROM Administrador f ";

        qry = this.entityManager.createQuery(jpql);

        List<Administrador> lst = qry.getResultList();

        this.entityManager.close();
        return lst;

    }
    
    public Administrador findById(Long idUsuario) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        jpql = " SELECT f "
                + " FROM Administrador f "
                + " WHERE f.idUsuario =:idUsuario ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idUsuario", idUsuario);

        List<Administrador> lst = qry.getResultList();

        this.entityManager.close();

        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
    
    public Administrador findByLoginSenha(String login, String senha) {
    this.entityManager = DatabaseJPA.getInstance().getEntityManager();

    jpql = "SELECT a FROM Administrador a WHERE a.login = :login AND a.senha = :senha";
    qry = this.entityManager.createQuery(jpql);
    
    qry.setParameter("login", login);
    qry.setParameter("senha", senha);

    try {
        return (Administrador) qry.getSingleResult();
    } catch (LoginException e) {
        return null;
    }
}
    
}
