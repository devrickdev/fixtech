/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Administrador;
import com.mycompany.fixtech.model.dao.AdministradorDAO;
import com.mycompany.fixtech.model.exceptions.AdministradorException;
import com.mycompany.fixtech.model.valid.ValidateAdministrador;
import com.mycompany.fixtech.view.tablemodels.TMCadAdministrador;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class AdministradorController {
    private final AdministradorDAO repositorio;

    public AdministradorController() {
        repositorio = new AdministradorDAO();
    }

    public void cadastrarAdministrador(Long idUsuario, String nome, String login, String senha, int permission) {
        ValidateAdministrador valid = new ValidateAdministrador();
        Administrador novoAdministrador = valid.validaCamposEntrada(idUsuario, nome, login, senha, permission);

        if (repositorio.findById(idUsuario) == null) {
            repositorio.save(novoAdministrador);
        } else {
            throw new AdministradorException("Error - Já existe um administrador com este 'ID'.");
        }
    }

    public void atualizarAdministrador(Long idUsuario,String nome, String login, String senha, int permission) {
        ValidateAdministrador valid = new ValidateAdministrador();
        Administrador novoAdministrador = valid.validaCamposEntrada(idUsuario, nome, login, senha, permission);
        novoAdministrador.setIdUsuario(idUsuario);
        
        repositorio.update(novoAdministrador);
    }

    public Administrador buscarAdministrador(Long idUsuario) {
        return (Administrador) this.repositorio.findById(idUsuario);
    }
    
    public Administrador buscarLoginSenha(String login, String senha){
        return (Administrador) this.repositorio.findByLoginSenha(login, senha);
    }
    
    public void atualizarTabela(JTable grd) {
        List<Administrador> lst = repositorio.findAll();
        
        TMCadAdministrador tmAdministrador = new TMCadAdministrador(lst);
        grd.setModel(tmAdministrador);        
    }

    public void excluirAdministrador(Administrador administrador) {
        if (administrador != null) {
            repositorio.delete(administrador);
        } else {
            throw new AdministradorException("Error - Administrador inexistente.");
        }
    }    
}
