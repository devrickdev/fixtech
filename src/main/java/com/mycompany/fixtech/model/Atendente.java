/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Atendente extends Usuario {
    public int idAtendente;
    
    public Atendente() {
        super();
        this.idAtendente = 0;
    }
    
    public void registrarAtendimento(){}
    
    public void consultarHistorico(){}
    
    @Override
    public String toString() {
        String txt
                = "---------- Atendente -----------\n";
        txt += super.toString();
        txt += "idAtendente: " + this.idAtendente + "\n"
                + "-------------------------------------\n";
        return txt;
    }
    
    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }
    
}
