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
    public Cliente validaCamposEntrada(int idCliente, String nome, String login, String senha, int permission){
        Cliente cliente = new Cliente();
        if (nome.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'nome'.");
        cliente.setNome(nome);
                
        return cliente;
    }
}
