/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author henry
 */
@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPeca;
    private String nome;
    private int quantidade;
    private double valorUnidade;

    public Peca() {}

    public Peca(Long idPeca, String nome, int quantidade, double valorUnidade) {
        this.idPeca = idPeca;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
    }
    
    @Override
    public String toString() {
        String txt = "idPeca: " + this.idPeca +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Quantidade: "+ this.quantidade +"\n"
        +"ValorUnidade: "+ this.valorUnidade +"\n";
        return txt;
    }   

    public Long getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Long idPeca) {
        this.idPeca = idPeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
}
