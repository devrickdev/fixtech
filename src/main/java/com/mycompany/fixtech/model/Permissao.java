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

    @Override
    public String toString() {
        return "Permissao{" + "IdPermissao=" + IdPermissao + ", descricao=" + descricao + '}';
    }
    
    
}
