/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import java.util.List;

/**
 *
 * @author henry
 */
public class Estoque {
    public int idEstoque;
    public List<Peca> estoquepeca;

    public Estoque() {
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public List<Peca> getEstoquepeca() {
        return estoquepeca;
    }

    public void setEstoquepeca(List<Peca> estoquepeca) {
        this.estoquepeca = estoquepeca;
    }

    @Override
    public String toString() {
        return "Estoque{" + "idEstoque=" + idEstoque + ", estoquepeca=" + estoquepeca + '}';
    }
    
    public void darEntrada(){
    
    }
    
    public void darSaida(){
    
    }
    
    public void consularSaldo(){
    
    }
}
