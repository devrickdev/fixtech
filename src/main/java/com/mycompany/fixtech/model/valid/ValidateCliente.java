/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.exceptions.ClienteException;

/**
 *
 * @author henry
 */
public class ValidateCliente {
    public Cliente validaCamposEntrada(Long idUsuario, String nome, String login, String senha, String telefone, int permission){
        Cliente cliente = new Cliente();
        if (nome.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'nome'.");
        cliente.setNome(nome);
        
        if (login.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'login'.");
        cliente.setLogin(login);
        
        if (senha.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'senha'.");
        cliente.setSenha(senha);
        
        if (telefone.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'telefone'.");
        cliente.setTelefone(telefone);
        
        return cliente;
    }
}
