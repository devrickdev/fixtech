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
@DiscriminatorValue("Atendente")
public class Atendente extends Usuario {
    
    public Atendente() {}

    public Atendente(Long idUsuario, String nome, String login, String senha, int permission) {
        super(idUsuario, nome, login, senha, permission);
    }
    
    @Override
    public String toString() {
        String txt
                = "---------- Atendente -----------\n";
        txt += super.toString()
                + "-------------------------------------\n";
        return txt;
    }
    
    public void registrarAtendimento(){}
    
    public void consultarHistorico(){}
}
