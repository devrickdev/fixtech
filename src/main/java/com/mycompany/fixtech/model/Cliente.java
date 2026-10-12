/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author henry
 */
@Entity
@DiscriminatorValue("Cliente")
public class Cliente extends Usuario{
    private String telefone;
    private String endereco;

    public Cliente() {}

    public Cliente(String telefone, String endereco, Long idUsuario, String nome, String login, String senha, int permission) {
        super(idUsuario, nome, login, senha, permission);
        this.telefone = telefone;
        this.endereco = endereco;
    }

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
    
    public void registarFeedback(){}
    
    public void consultarHistorico(){}
    
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
