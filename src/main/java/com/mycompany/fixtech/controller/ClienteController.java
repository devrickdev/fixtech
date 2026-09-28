/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Cliente;
import com.mycompany.fixtech.model.dao.ClienteDAO;
import com.mycompany.fixtech.model.exceptions.ClienteException;
import com.mycompany.fixtech.model.valid.ValidateCliente;
import com.mycompany.fixtech.view.TMCadCliente;
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

    public void cadastrarCliente(int idCliente, String nome, String login, String senha, int permission) {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(idCliente, nome, login, senha, permission);

        if (repositorio.findById(idCliente) == null) {
            repositorio.save(novoCliente);
        } else {
            throw new ClienteException("Error - Já existe um cliente com este 'ID'.");
        }
    }

    public void atualizarCliente(int idCliente,String nome, String login, String senha, int permission) {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(idCliente, nome, login, senha, permission);
        novoCliente.setIdCliente(idCliente);
        
        repositorio.update(novoCliente);
    }

    public Cliente buscarCliente(int idCliente) {
        return (Cliente) this.repositorio.findById(idCliente);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadCliente tmCliente = new TMCadCliente(lst);
        grd.setModel(tmCliente);        
    }

    public void excluirAtendente(Cliente cliente) {
        if (cliente != null) {
            repositorio.delete(cliente);
        } else {
            throw new ClienteException("Error - Cliente inexistente.");
        }
    }    
}
