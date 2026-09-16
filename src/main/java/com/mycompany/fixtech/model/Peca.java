/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Peca {
    public int idPeca;
    public String nome;
    public int quantidade;
    public int valorUnidade;

    public Peca() {
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
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

    public int getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(int valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    @Override
    public String toString() {
        return "Peca{" + "idPeca=" + idPeca + ", nome=" + nome + ", quantidade=" + quantidade + ", valorUnidade=" + valorUnidade + '}';
    }
    
    
}
