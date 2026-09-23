/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Cliente extends Usuario{
    public int idCliente;
    public String telefone;
    public String endereco;

    public Cliente() {
        super();
        this.telefone = "";
        this.endereco = "";
    }
    
    public void registarFeedback(){}
    
    public void consultarHistorico(){}

    @Override
    public String toString() {
        String txt
                = "---------- Cliente -----------\n";
        txt += super.toString();
        txt += "Telefone: " + this.telefone + "\n";
        txt += "Endereco: " + this.endereco + "\n"
                + "-------------------------------------\n";
        return txt;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
