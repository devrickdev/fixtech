/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Dispositivo {
    private int idDispositivo;
    private String nome;
    private String tipo;
    private String marca;
    private String modelo;

    public Dispositivo() {
        this.idDispositivo = 0;
        this.nome = "";
        this.tipo = "";
        this.marca = "";
        this.modelo = "";
    }
    
    @Override
    public String toString() {
        String txt = "IdDispositivo: " + this.idDispositivo +"\n"
        +"Nome: "+ this.nome + "\n"
        +"Tipo: "+ this.tipo + "\n"
        +"Marca: "+ this.marca + "\n"
        +"Modelo: "+ this.modelo + "\n";
        return txt;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
