/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Feedback;
import com.mycompany.fixtech.model.dao.FeedbackDAO;
import com.mycompany.fixtech.model.exceptions.FeedbackException;
import com.mycompany.fixtech.model.valid.ValidateFeedback;
import com.mycompany.fixtech.view.tablemodels.TMCadFeedback;
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

    public void cadastrarFeedback(Long idFeedback, String atendimentoDescricao, String nota, String comentario) {
        ValidateFeedback valid = new ValidateFeedback();
        Feedback novoFeedback = valid.validaCamposEntrada(idFeedback, atendimentoDescricao, nota, comentario);

        if (repositorio.findById(idFeedback) == null) {
            repositorio.save(novoFeedback);
        } else {
            throw new FeedbackException("Error - Já existe um feedback com este 'ID'.");
        }
    }

    public void atualizarFeedback(Long idFeedback, String atendimentoDescricao, String nota, String comentario) {
        ValidateFeedback valid = new ValidateFeedback();
        Feedback novoFeedback = valid.validaCamposEntrada(idFeedback,atendimentoDescricao, nota, comentario);
        novoFeedback.setIdFeedback(idFeedback);
        
        repositorio.update(novoFeedback);
    }

    public Feedback buscarFeedback(Long idFeedback) {
        return (Feedback) this.repositorio.findById(idFeedback);
    }

    public void atualizarTabela(JTable grd) {
        List<Feedback> lst = repositorio.findAll();
        
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
