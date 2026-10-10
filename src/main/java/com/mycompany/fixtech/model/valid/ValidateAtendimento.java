/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.exceptions.AtendimentoException;
/**
 *
 * @author henry
 */
public class ValidateAtendimento {
    public Atendimento validaCamposEntrada(int idAtendimento, String cliente, String atendente, String dispositivo, String status, String descricao){
        Atendimento atendimento = new Atendimento();
        if (descricao.isEmpty())
            throw new AtendimentoException("Error - Campo vazio: 'descricao'.");
        atendimento.setDescricao(descricao);
                
        return atendimento;
    }
}
