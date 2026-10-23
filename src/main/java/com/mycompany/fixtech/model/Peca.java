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
    private int estoque;
    private double valorUnidade;

    public Peca() {}

    public Peca(Long idPeca, String nome, int estoque, double valorUnidade) {
        this.idPeca = idPeca;
        this.nome = nome;
        this.estoque = estoque;
        this.valorUnidade = valorUnidade;
    }
    
    @Override
    public String toString() {
        String txt = "idPeca: " + this.idPeca +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Estoque: "+ this.estoque + "\n"
        +"ValorUnidade: "+ this.valorUnidade +"\n";
        return txt;
    }   

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
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

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
}
