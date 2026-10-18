/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model.valid;

import com.mycompany.fixtech.model.Dispositivo;
import com.mycompany.fixtech.model.exceptions.DispositivoException;

/**
 *
 * @author henry
 */
public class ValidateDispositivo {
    public Dispositivo validaCamposEntrada(Long idDispositivo, String nome, String tipo, String marca){
        Dispositivo dispositivo = new Dispositivo();
        if (nome.isEmpty())
            throw new DispositivoException("Error - Campo vazio: 'nome'.");
        dispositivo.setNome(nome);
        
        if (tipo.isEmpty())
            throw new DispositivoException("Error - Campo vazio: 'tipo'.");
        dispositivo.setTipo(tipo);
        
        if (marca.isEmpty())
            throw new DispositivoException("Error - Campo vazio: 'marca'.");
        dispositivo.setMarca(marca);
        
        return dispositivo;
    }
}
