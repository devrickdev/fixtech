/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author henry
 */
public class DatabaseJPA {
    private EntityManagerFactory factory;

    private static DatabaseJPA INSTANCE = null;

    public static DatabaseJPA getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseJPA();
        }
        return INSTANCE;
    }

    private DatabaseJPA() {
        factory = Persistence.createEntityManagerFactory("fixtech-jpa");        
    }
    
    public EntityManager getEntityManager() {        
        return factory.createEntityManager();
    }
    
    public void closeFactory(){
        this.factory.close();
    }
}
