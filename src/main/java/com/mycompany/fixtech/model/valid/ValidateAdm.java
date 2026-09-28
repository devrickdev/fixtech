/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Administrador;
import com.mycompany.fixtech.model.exceptions.AdmException;

/**
 *
 * @author henry
 */
public class ValidateAdm {
    public Administrador validaCamposEntrada(int idAdm, String nome, String login, String senha, int permission){
        Administrador adm = new Administrador();
        if (nome.isEmpty())
            throw new AdmException("Error - Campo vazio: 'nome'.");
        adm.setNome(nome);
                
        return adm;
    }
    
}
