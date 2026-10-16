/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author henry
 */
@Entity
public class Atendimento {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long idAtendimento;
   @ManyToOne(fetch = FetchType.LAZY)
   private Cliente cliente;
   @ManyToOne(fetch = FetchType.LAZY)
   private Atendente atendente;
   @ManyToOne(fetch = FetchType.LAZY)
   private Dispositivo dispositivo;
   private String status;
   private String descricao;
   
   public Atendimento() {}
   
   public Atendimento(Long idAtendimento, Cliente cliente, Atendente atendente, Dispositivo dispositivo, String status, String descricao) {
        this.idAtendimento = idAtendimento;
        this.cliente = cliente;       
        this.atendente = atendente;   
        this.dispositivo = dispositivo;
        this.status = status;
        this.descricao = descricao;
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
    
    public Long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Long idAtendimento) {
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
