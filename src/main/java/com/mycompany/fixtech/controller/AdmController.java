/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Administrador;
import com.mycompany.fixtech.model.dao.AdmDAO;
import com.mycompany.fixtech.model.exceptions.AdmException;
import com.mycompany.fixtech.model.valid.ValidateAdm;
import com.mycompany.fixtech.view.TMCadAdm;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class AdmController {
    private final AdmDAO repositorio;

    public AdmController() {
        repositorio = new AdmDAO();
    }

    public void cadastrarAdm(int idAdm, String nome, String login, String senha, int permission) {
        ValidateAdm valid = new ValidateAdm();
        Administrador novoAdm = valid.validaCamposEntrada(idAdm, nome, login, senha, permission);

        if (repositorio.findById(idAdm) == null) {
            repositorio.save(novoAdm);
        } else {
            throw new AdmException("Error - Já existe um adm com este 'ID'.");
        }
    }

    public void atualizarAdm(int idAdm,String nome, String login, String senha, int permission) {
        ValidateAdm valid = new ValidateAdm();
        Administrador novoAdm = valid.validaCamposEntrada(idAdm, nome, login, senha, permission);
        novoAdm.setIdAdm(idAdm);
        
        repositorio.update(novoAdm);
    }

    public Administrador buscarAdm(int idAdministrador) {
        return (Administrador) this.repositorio.findById(idAdministrador);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadAdm tmAdm = new TMCadAdm(lst);
        grd.setModel(tmAdm);        
    }

    public void excluirAdm(Administrador adm) {
        if (adm != null) {
            repositorio.delete(adm);
        } else {
            throw new AdmException("Error - Adm inexistente.");
        }
    }    
}
