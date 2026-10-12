/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import com.mycompany.fixtech.factory.DatabaseJPA;
import com.mycompany.fixtech.model.Atendimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author henry
 */
public class AtendimentoDAO implements IDao<Atendimento> {

    private EntityManager entityManager;

    private Query qry;
    private String jpql;

    public AtendimentoDAO() {

    }

    @Override
    public void save(Atendimento obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
    }

    @Override
    public void update(Atendimento obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        this.entityManager.getTransaction().begin();
        this.entityManager.merge(obj);
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
    }

    @Override
    public boolean delete(Atendimento obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Atendimento atendimento = (Atendimento) obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Atendimento WHERE idAtendimento=:idAtendimento ");
        qry.setParameter("idAtendimento", atendimento.getIdAtendimento());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();

        this.entityManager.close();
        return true;
    }

    @Override
    public Atendimento find(Atendimento obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Atendimento atendimento = (Atendimento) obj;
        Atendimento f = this.entityManager.find(Atendimento.class, atendimento.getIdAtendimento());
        this.entityManager.close();
        return f;
    }

    @Override
    public List<Atendimento> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        jpql = " SELECT f "
                + " FROM Atendimento f ";

        qry = this.entityManager.createQuery(jpql);

        List lst = qry.getResultList();

        this.entityManager.close();
        return (List<Atendimento>) lst;

    }

    public Atendimento findById(Long idAtendimento) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();

        jpql = " SELECT f "
                + " FROM Atendimento f "
                + " WHERE f.idAtendimento like :idAtendimento ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("idAtendimento", idAtendimento);

        List lst = qry.getResultList();

        this.entityManager.close();

        if (lst.isEmpty()) {
            return null;
        } else {
            return (Atendimento) lst.get(0);
        }
    }

}
