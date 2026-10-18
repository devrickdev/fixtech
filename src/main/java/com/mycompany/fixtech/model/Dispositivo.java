/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author henry
 */
@Entity
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDispositivo;
    private String nome;
    private String tipo;
    private String marca;

    public Dispositivo() {}

    public Dispositivo(Long idDispositivo, String nome, String tipo, String marca) {
        this.idDispositivo = idDispositivo;
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        String txt = "IdDispositivo: " + this.idDispositivo +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Tipo: "+ this.tipo + "\n"
        +"Marca: "+ this.marca + "\n";
        return txt;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Long getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Long idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
