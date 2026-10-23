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
    public Peca validaCamposEntrada(Long idPeca, String nome, String estoque, String valorUnidade){
        Peca peca = new Peca();
        if (nome.isEmpty())
            throw new PecaException("Error - Campo vazio: 'nome'.");
        peca.setNome(nome);
        
        int estoqueInt = 0;
        if (estoque.isEmpty())
            throw new PecaException("Error - Campo vazio: 'estoque'.");
       
        estoqueInt = Integer.parseInt(estoque);
        peca.setEstoque(estoqueInt); 
        
        
        Double valorUnidadeDouble = 0.0;
        if (valorUnidade.isEmpty())
            throw new PecaException("Error - Campo vazio: 'valorUnidade'.");
       
        valorUnidadeDouble = Double.parseDouble(valorUnidade);
        peca.setValorUnidade(valorUnidadeDouble);        
                
        return peca;
    }
}
