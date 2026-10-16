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
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

/**
 *
 * @author henry
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("tipo")
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long idUsuario;
    protected String nome;
    protected String login;
    protected String senha;

    public Usuario() {}

    public Usuario(Long idUsuario, String nome, String login, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        String txt = "IdUsuario: " + this.idUsuario +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Login: "+ this.login + "\n"
        +"Senha: "+ this.senha +"\n";
        return txt;
    }   
    
    public void autenticar(){}
    
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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
