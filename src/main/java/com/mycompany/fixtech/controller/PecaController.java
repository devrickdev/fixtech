/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.model.Peca;
import com.mycompany.fixtech.model.dao.PecaDAO;
import com.mycompany.fixtech.model.exceptions.PecaException;
import com.mycompany.fixtech.model.valid.ValidatePeca;
import com.mycompany.fixtech.view.tablemodels.TMCadPeca;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class PecaController {
    private final PecaDAO repositorio;

    public PecaController() {
        repositorio = new PecaDAO();
    }

    public void cadastrarPeca(int idPeca, String nome, int quantidade, double valorUnidade, Atendimento atendimento) {
        ValidatePeca valid = new ValidatePeca();
        Peca novoPeca = valid.validaCamposEntrada(idPeca, nome, quantidade, valorUnidade, atendimento);

        if (repositorio.findById(idPeca) == null) {
            repositorio.save(novoPeca);
        } else {
            throw new PecaException("Error - Já existe uma peca com este 'ID'.");
        }
    }

    public void atualizarPeca(int idPeca, String nome, int quantidade, double valorUnidade, Atendimento atendimento) {
        ValidatePeca valid = new ValidatePeca();
        Peca novoPeca = valid.validaCamposEntrada(idPeca, nome, quantidade, valorUnidade, atendimento);
        novoPeca.setIdPeca(idPeca);
        
        repositorio.update(novoPeca);
    }

    public Peca buscarPeca(int idPeca) {
        return (Peca) this.repositorio.findById(idPeca);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadPeca tmPeca = new TMCadPeca(lst);
        grd.setModel(tmPeca);        
    }

    public void excluirPeca(Peca peca) {
        if (peca != null) {
            repositorio.delete(peca);
        } else {
            throw new PecaException("Error - Peca inexistente.");
        }
    }    
}
