/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import java.util.Date;

/**
 *
 * @author henry
 */
public class Relatorio {
    public Date dataGeracao;

    public Relatorio() {
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "dataGeracao=" + dataGeracao + '}';
    }
    
    public void gerar(){
    
    }
}
