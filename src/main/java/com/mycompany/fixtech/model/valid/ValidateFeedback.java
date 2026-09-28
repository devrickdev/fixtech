/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.Feedback;
import com.mycompany.fixtech.model.exceptions.FeedbackException;

/**
 *
 * @author henry
 */
public class ValidateFeedback {
    public Feedback validaCamposEntrada(int idFeedback, Atendimento atendimento, int nota, String comentario){
        Feedback feedback = new Feedback();
        if (comentario.isEmpty())
            throw new FeedbackException("Error - Campo vazio: 'comentario'.");
        feedback.setComentario(comentario);
                
        return feedback;
    }
}
