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
    public int idDispositivo;
    public String tipo;
    public String marca;
    public String modelo;
    
    @Override
    public String toString() {
        String txt = "IdDispositivo: " + this.idDispositivo +"\n"
        +"Tipo: "+ this.tipo + "\n"
        +"Marca: "+ this.marca + "\n"
        +"Modelo: "+ this.modelo + "\n";
        return txt;
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
