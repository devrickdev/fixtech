/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Administrador extends Usuario{
    public int idAdm;
    
    public Administrador() {
        super();
        this.idAdm = 0;
    }

    @Override
    public String toString() {
        String txt
                = "---------- Administrador -----------\n";
        txt += super.toString();
        txt += "idAdm: " + this.idAdm + "\n"
                + "-------------------------------------\n";
        return txt;
    }
    
    public void gerenciarPermissoes(){}
    
    public void gerarRelatorio(){}

    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }
    
}
