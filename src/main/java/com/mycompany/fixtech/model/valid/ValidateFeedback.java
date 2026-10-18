/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Feedback;
import com.mycompany.fixtech.model.exceptions.FeedbackException;

/**
 *
 * @author henry
 */
public class ValidateFeedback {
    public Feedback validaCamposEntrada(Long idFeedback, String atendimentoDescricao, String nota, String comentario){
        Feedback feedback = new Feedback();
        if (comentario.isEmpty())
            throw new FeedbackException("Error - Campo vazio: 'comentario'.");
        feedback.setComentario(comentario);
        
        if (atendimentoDescricao.isEmpty())
            throw new FeedbackException("Error - Campo vazio: 'atendimentoDescricao'.");
        feedback.getAtendimento().setDescricao(atendimentoDescricao);
        
        int notaInt = 0;
        if (nota.isEmpty())
            throw new FeedbackException("Error - Campo vazio: 'nota'.");
        
        notaInt = Integer.parseInt(nota);
        feedback.setNota(notaInt); 
                
        return feedback;
    }
}
