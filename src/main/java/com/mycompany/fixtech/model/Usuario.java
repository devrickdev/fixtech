/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public abstract class Usuario {
    public String nome;
    public String login;
    public String senha;

    public Usuario() {
        this.nome ="";
        this.login="";
        this.senha = "";
    }
    
    public void autenticar(){}

    @Override
    public String toString() {
        String txt = "Nome: " + this.nome +"\n"
        +"Login: "+ this.login + "\n"
        +"Senha: "+ this.senha+"\n";
        return txt;
    }   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
