/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.controller;

import com.mycompany.fixtech.model.Dispositivo;
import com.mycompany.fixtech.model.dao.DispositivoDAO;
import com.mycompany.fixtech.model.exceptions.DispositivoException;
import com.mycompany.fixtech.model.valid.ValidateDispositivo;
import com.mycompany.fixtech.view.TMCadDispositivo;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author henry
 */
public class DispositivoController {
    private final DispositivoDAO repositorio;

    public DispositivoController() {
        repositorio = new DispositivoDAO();
    }

    public void cadastrarDispositivo(int idDispositivo, String tipo, String marca, String modelo) {
        ValidateDispositivo valid = new ValidateDispositivo();
        Dispositivo novoDispositivo = valid.validaCamposEntrada(idDispositivo, tipo, marca, modelo);

        if (repositorio.findById(idDispositivo) == null) {
            repositorio.save(novoDispositivo);
        } else {
            throw new DispositivoException("Error - Já existe um dispositivo com este 'ID'.");
        }
    }

    public void atualizarDispositivo(int idDispositivo,String tipo, String marca, String modelo) {
        ValidateDispositivo valid = new ValidateDispositivo();
        Dispositivo novoDispositivo = valid.validaCamposEntrada(idDispositivo, tipo, marca, modelo);
        novoDispositivo.setIdDispositivo(idDispositivo);
        
        repositorio.update(novoDispositivo);
    }

    public Dispositivo buscarDispositivo(int idDispositivo) {
        return (Dispositivo) this.repositorio.findById(idDispositivo);
    }

    public void atualizarTabela(JTable grd) {
        List<Object> lst = repositorio.findAll();
        
        TMCadDispositivo tmDispositivo = new TMCadDispositivo(lst);
        grd.setModel(tmDispositivo);        
    }

    public void excluirDispositivo(Dispositivo dispositivo) {
        if (dispositivo != null) {
            repositorio.delete(dispositivo);
        } else {
            throw new DispositivoException("Error - Dispositivo inexistente.");
        }
    }    
}
