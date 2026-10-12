/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author henry
 */
@Entity
@DiscriminatorValue("Usuario")
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long idUsuario;
    protected int permission;
    protected String nome;
    protected String login;
    protected String senha;

    public Usuario() {}

    public Usuario(Long idUsuario, String nome, String login, String senha, int permission) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.permission = permission;
    }

    @Override
    public String toString() {
        String txt = "IdUsuario: " + this.idUsuario +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Login: "+ this.login + "\n"
        +"Senha: "+ this.senha +"\n"
        +"Permission: "+ this.permission +"\n";
        return txt;
    }   
    
    public void autenticar(){}
    
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
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
