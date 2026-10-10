/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Peca;
import com.mycompany.fixtech.model.exceptions.PecaException;

/**
 *
 * @author henry
 */
public class ValidatePeca {
    public Peca validaCamposEntrada(int idPeca, String nome, int quantidade, double valorUnidade){
        Peca peca = new Peca();
        if (nome.isEmpty())
            throw new PecaException("Error - Campo vazio: 'nome'.");
        peca.setNome(nome);
                
        return peca;
    }
}
