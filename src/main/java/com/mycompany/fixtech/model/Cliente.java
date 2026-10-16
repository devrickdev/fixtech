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
    public final int permission = 3;
    private String telefone;

    public Cliente() {}

    public Cliente(String telefone, Long idUsuario, String nome, String login, String senha) {
        super(idUsuario, nome, login, senha);
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String txt
                = "---------- Cliente -----------\n";
        txt += super.toString();
        txt += "Telefone: " + this.telefone + "\n"
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

    public int getPermission(){
        return permission;
    }
}
