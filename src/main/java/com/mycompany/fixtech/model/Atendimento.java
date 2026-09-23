/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

/**
 *
 * @author henry
 */
public class Atendimento {
   public int idAtendimento;
   public Cliente cliente;
   public Atendente atendente;
   public Dispositivo dispositivo;
   public String status;
   public String descricao;

    public Atendimento() {
        this.idAtendimento = 0;
        this.cliente = new Cliente();
        this.atendente = new Atendente();
        this.dispositivo = new Dispositivo();
        this.status = "";
    }
    
    @Override
    public String toString(){
        String txt = "---- Dados do Atendimento ----\n"
        +"idAtendimento: " + this.idAtendimento + "\n"
        +"Status: "+ this.status + "\n";        
        txt += cliente.toString();
        txt += atendente.toString();
        txt += dispositivo.toString();
        return txt;
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
