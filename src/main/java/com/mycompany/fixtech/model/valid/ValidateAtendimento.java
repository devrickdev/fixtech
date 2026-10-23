/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Atendente;
import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.Dispositivo;
import com.mycompany.fixtech.model.exceptions.AtendimentoException;
/**
 *
 * @author henry
 */
public class ValidateAtendimento {
    public Atendimento validaCamposEntrada(Long idAtendimento, Dispositivo dispositivo, Cliente cliente, Atendente atendente, String status, String descricao){
        Atendimento atendimento = new Atendimento();
        
        if (dispositivo == null) {
            throw new AtendimentoException("Error - Dispositivo não selecionado");
        }
        atendimento.setDispositivo(dispositivo);
        
        if (cliente == null) {
            throw new AtendimentoException("Error - Cliente não selecionado");
        }
        atendimento.setCliente(cliente);
        
        if (atendente == null) {
            throw new AtendimentoException("Error - Atendente não selecionada");
        }
        atendimento.setAtendente(atendente);
        
        if (descricao.isEmpty())
            throw new AtendimentoException("Error - Campo vazio: 'descricao'.");
        atendimento.setDescricao(descricao);
        
        if (status.isEmpty())
            throw new AtendimentoException("Error - Campo vazio: 'status'.");
        atendimento.setStatus(status);
                
        return atendimento;
    }
}
