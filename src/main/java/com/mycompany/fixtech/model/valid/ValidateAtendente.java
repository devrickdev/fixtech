/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Atendente;
import com.mycompany.fixtech.model.exceptions.AtendenteException;

/**
 *
 * @author henry
 */
public class ValidateAtendente {
    public Atendente validaCamposEntrada(int idAtendente, String nome, String login, String senha, int permission){
        Atendente atendente = new Atendente();
        if (nome.isEmpty())
            throw new AtendenteException("Error - Campo vazio: 'nome'.");
        atendente.setNome(nome);
                
        return atendente;
    }
}
