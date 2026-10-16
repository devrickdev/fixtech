/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Administrador;
import com.mycompany.fixtech.model.exceptions.AdministradorException;

/**
 *
 * @author henry
 */
public class ValidateAdministrador {
    public Administrador validaCamposEntrada(Long idUsuario, String nome, String login, String senha, int permission){
        Administrador administrador = new Administrador();
        if (nome.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'nome'.");
        administrador.setNome(nome);
        
        if (login.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'login'.");
        administrador.setLogin(login);
        
        if (senha.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'senha'.");
        administrador.setSenha(senha);
                
        return administrador;
    }
    
}
