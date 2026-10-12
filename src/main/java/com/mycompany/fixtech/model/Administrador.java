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
@DiscriminatorValue("Administrador")
public class Administrador extends Usuario{
    
    public Administrador() {}

    public Administrador(Long idUsuario, String nome, String login, String senha, int permission) {
        super(idUsuario, nome, login, senha, permission);
    }
    
    @Override
    public String toString() {
        String txt
                = "---------- Administrador -----------\n";
        txt += super.toString()
                + "-------------------------------------\n";
        return txt;
    }
    
    public void gerarRelatorio(){}

}
