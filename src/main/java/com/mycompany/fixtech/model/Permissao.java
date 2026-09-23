/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Permissao {
    public int IdPermissao;
    public String descricao;

    public Permissao() {
        this.IdPermissao = 0;
        this.descricao = "";
    }
        
    @Override
    public String toString() {
        String txt = "IdPermissao: " + this.IdPermissao +"\n"
        +"Descricao: "+ this.descricao + "\n";
        return txt;
    }   
    
    public int getIdPermissao() {
        return IdPermissao;
    }

    public void setIdPermissao(int IdPermissao) {
        this.IdPermissao = IdPermissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
