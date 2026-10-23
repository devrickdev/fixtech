/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author henry
 */
@Entity
public class ItemAtendimento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idItem;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Atendimento atendimento; 
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Peca peca;       
   
    private int quantidade;          
    private double precoMomento;
    
    public ItemAtendimento() {}
    
    public ItemAtendimento(Long idItem, Atendimento atendimento, Peca peca, int quantidade, double precoMomento) {
        this.idItem = idItem;
        this.atendimento = atendimento;
        this.peca = peca;
        this.quantidade = quantidade;
        this.precoMomento = precoMomento;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoMomento() {
        return precoMomento;
    }

    public void setPrecoMomento(double precoMomento) {
        this.precoMomento = precoMomento;
    }    
}
