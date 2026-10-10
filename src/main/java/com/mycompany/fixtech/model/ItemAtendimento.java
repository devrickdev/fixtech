/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class ItemAtendimento {
    private int idItem;
    private Atendimento atendimento; 
    private Peca peca;               
    private int quantidade;          
    private double precoMomento;

    public ItemAtendimento(int idItem, Atendimento atendimento, Peca peca, int quantidade, double precoMomento) {
        this.idItem = idItem;
        this.atendimento = atendimento;
        this.peca = peca;
        this.quantidade = quantidade;
        this.precoMomento = precoMomento;
    }

    public ItemAtendimento() {
        this.idItem = 0;
        this.quantidade = 0;
        this.precoMomento = 0.0;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
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
