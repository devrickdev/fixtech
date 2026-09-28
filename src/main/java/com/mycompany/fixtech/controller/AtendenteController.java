/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Atendente;
import com.mycompany.fixtech.model.dao.AtendenteDAO;
import com.mycompany.fixtech.model.exceptions.AtendenteException;
import com.mycompany.fixtech.model.valid.ValidateAtendente;
import com.mycompany.fixtech.view.tablemodels.TMCadAtendente;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class AtendenteController {
    private final AtendenteDAO repositorio;

    public AtendenteController() {
        repositorio = new AtendenteDAO();
    }

    public void cadastrarAtendente(int idAtendente, String nome, String login, String senha, int permission) {
        ValidateAtendente valid = new ValidateAtendente();
        Atendente novoAtendente = valid.validaCamposEntrada(idAtendente, nome, login, senha, permission);

        if (repositorio.findById(idAtendente) == null) {
            repositorio.save(novoAtendente);
        } else {
            throw new AtendenteException("Error - Já existe um atendente com este 'ID'.");
        }
    }

    public void atualizarAtendente(int idAtendente,String nome, String login, String senha, int permission) {
        ValidateAtendente valid = new ValidateAtendente();
        Atendente novoAtendente = valid.validaCamposEntrada(idAtendente, nome, login, senha, permission);
        novoAtendente.setIdAtendente(idAtendente);
        
        repositorio.update(novoAtendente);
    }

    public Atendente buscarAtendente(int idAtendente) {
        return (Atendente) this.repositorio.findById(idAtendente);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadAtendente tmAtendente = new TMCadAtendente(lst);
        grd.setModel(tmAtendente);        
    }

    public void excluirAtendente(Atendente atendente) {
        if (atendente != null) {
            repositorio.delete(atendente);
        } else {
            throw new AtendenteException("Error - Atendente inexistente.");
        }
    }    
}
