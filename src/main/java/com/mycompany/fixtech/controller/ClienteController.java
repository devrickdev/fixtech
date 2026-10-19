/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.dao.ClienteDAO;
import com.mycompany.fixtech.model.exceptions.ClienteException;
import com.mycompany.fixtech.model.valid.ValidateCliente;
import com.mycompany.fixtech.view.tablemodels.TMCadCliente;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class ClienteController {
    private final ClienteDAO repositorio;

    public ClienteController() {
        repositorio = new ClienteDAO();
    }

    public void cadastrarCliente(Long idUsuario, String nome, String login, String senha, String telefone, int permission) {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(idUsuario, nome, login, senha, telefone, permission);

        if (repositorio.findById(idUsuario) == null) {
            repositorio.save(novoCliente);
        } else {
            throw new ClienteException("Error - Já existe um cliente com este 'ID'.");
        }
    }

    public void atualizarCliente(Long idUsuario, String nome, String login, String senha, String telefone, int permission) {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(idUsuario, nome, login, senha, telefone, permission);
        novoCliente.setIdUsuario(idUsuario);
        
        repositorio.update(novoCliente);
    }

    public Cliente buscarCliente(Long idCliente) {
        return (Cliente) this.repositorio.findById(idCliente);
    }
    
    public Cliente buscarLoginSenha(String login, String senha){
        return (Cliente) this.repositorio.findByLoginSenha(login, senha);
    }
    
    public void atualizarTabela(JTable grd) {
        List<Cliente> lst = repositorio.findAll();
        
        TMCadCliente tmCliente = new TMCadCliente(lst);
        grd.setModel(tmCliente);        
    }

    public void excluirCliente(Cliente cliente) {
        if (cliente != null) {
            repositorio.delete(cliente);
        } else {
            throw new ClienteException("Error - Cliente inexistente.");
        }
    }    
}
