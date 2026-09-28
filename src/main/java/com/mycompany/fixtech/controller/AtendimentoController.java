/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Atendente;
import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.Dispositivo;
import com.mycompany.fixtech.model.dao.AtendimentoDAO;
import com.mycompany.fixtech.model.exceptions.AtendimentoException;
import com.mycompany.fixtech.model.valid.ValidateAtendimento;
import com.mycompany.fixtech.view.tablemodels.TMCadAtendimento;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class AtendimentoController {
    private final AtendimentoDAO repositorio;

    public AtendimentoController() {
        repositorio = new AtendimentoDAO();
    }

    public void cadastrarAtendimento(int idAtendimento, Cliente cliente, Atendente atendente, Dispositivo dispositivo, String status, String descricao) {
        ValidateAtendimento valid = new ValidateAtendimento();
        Atendimento novoAtendimento = valid.validaCamposEntrada(idAtendimento, cliente, atendente, dispositivo, status, descricao);

        if (repositorio.findById(idAtendimento) == null) {
            repositorio.save(novoAtendimento);
        } else {
            throw new AtendimentoException("Error - Já existe um atendimento com este 'ID'.");
        }
    }

    public void atualizarAtendimento(int idAtendimento, Cliente cliente, Atendente atendente, Dispositivo dispositivo, String status,String descricao) {
        ValidateAtendimento valid = new ValidateAtendimento();
        Atendimento novoAtendimento = valid.validaCamposEntrada(idAtendimento, cliente, atendente, dispositivo, status, descricao);
        novoAtendimento.setIdAtendimento(idAtendimento);
        
        repositorio.update(novoAtendimento);
    }

    public Atendimento buscarAtendimento(int idAtendimento) {
        return (Atendimento) this.repositorio.findById(idAtendimento);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadAtendimento tmAtendimento = new TMCadAtendimento(lst);
        grd.setModel(tmAtendimento);        
    }

    public void excluirAtendimento(Atendimento atendimento) {
        if (atendimento != null) {
            repositorio.delete(atendimento);
        } else {
            throw new AtendimentoException("Error - Atendimento inexistente.");
        }
    }    
}
