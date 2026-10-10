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
    private int idPeca;
    private String nome;
    private int quantidade;
    private double valorUnidade;

    public Peca() {
        this.idPeca = 0;
        this.nome = "";
        this.quantidade = 0;
        this.valorUnidade = 0.0;
    }

    @Override
    public String toString() {
        String txt = "idPeca: " + this.idPeca +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Quantidade: "+ this.quantidade +"\n"
        +"ValorUnidade: "+ this.valorUnidade +"\n";
        return txt;
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

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
}
