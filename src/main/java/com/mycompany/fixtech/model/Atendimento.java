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
   private int idAtendimento;
   private Cliente cliente;
   private Atendente atendente;
   private Dispositivo dispositivo;
   private String status;
   private String descricao;
   
    public Atendimento(int idAtendimento, Cliente cliente, Atendente atendente, Dispositivo dispositivo, String status, String descricao) {
        this.idAtendimento = idAtendimento;
        this.cliente = cliente;       
        this.atendente = atendente;   
        this.dispositivo = dispositivo;
        this.status = status;
        this.descricao = descricao;
    }
    
    public Atendimento() {
        this.idAtendimento = 0;
        this.status = "Pendente";
        this.descricao = "";
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
    
    public String getClienteNome() {
        return cliente.getNome();
    }
    
    public String getAtendenteNome() {
        return atendente.getNome();
    }
    
    public String getDispositivoNome() {
        return dispositivo.getNome();
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
