/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.Feedback;
import com.mycompany.fixtech.model.dao.FeedbackDAO;
import com.mycompany.fixtech.model.exceptions.FeedbackException;
import com.mycompany.fixtech.model.valid.ValidateFeedback;
import com.mycompany.fixtech.view.TMCadFeedback;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class FeedbackController {
    private final FeedbackDAO repositorio;

    public FeedbackController() {
        repositorio = new FeedbackDAO();
    }

    public void cadastrarFeedback(int idFeedback, Atendimento atendimento, int nota, String comentario) {
        ValidateFeedback valid = new ValidateFeedback();
        Feedback novoFeedback = valid.validaCamposEntrada(idFeedback, atendimento, nota, comentario);

        if (repositorio.findById(idFeedback) == null) {
            repositorio.save(novoFeedback);
        } else {
            throw new FeedbackException("Error - Já existe um feedback com este 'ID'.");
        }
    }

    public void atualizarFeedback(int idFeedback,Atendimento atendimento, int nota, String comentario) {
        ValidateFeedback valid = new ValidateFeedback();
        Feedback novoFeedback = valid.validaCamposEntrada(idFeedback,atendimento, nota, comentario);
        novoFeedback.setIdFeedback(idFeedback);
        
        repositorio.update(novoFeedback);
    }

    public Feedback buscarFeedback(int idFeedback) {
        return (Feedback) this.repositorio.findById(idFeedback);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadFeedback tmFeedback = new TMCadFeedback(lst);
        grd.setModel(tmFeedback);        
    }

    public void excluirFeedback(Feedback feedback) {
        if (feedback != null) {
            repositorio.delete(feedback);
        } else {
            throw new FeedbackException("Error - Feedback inexistente.");
        }
    }    
}
