/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fixtech.model.dao;

import java.util.List;

/**
 *
 * @author henry
 * @param <T>
 */
public interface IDao<T> {
    public void save(T obj);
    
    public void update(T obj);
    
    public boolean delete(T obj);
            
    public T find(T obj);
        
    public List<T> findAll();
}
