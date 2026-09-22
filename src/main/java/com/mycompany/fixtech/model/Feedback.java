/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;

import java.util.Date;

/**
 *
 * @author henry
 */
public class Feedback {
    public int idFeedback;
    public Cliente cliente;
    public int nota;
    public String comentario;
    public Date dataFeedback;

    public Feedback() {
    }

    public int getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(int idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataFeedback() {
        return dataFeedback;
    }

    public void setDataFeedback(Date dataFeedback) {
        this.dataFeedback = dataFeedback;
    }

    @Override
    public String toString() {
        return "Feedback{" + "idFeedback=" + idFeedback + ", cliente=" + cliente + ", nota=" + nota + ", comentario=" + comentario + ", dataFeedback=" + dataFeedback + '}';
    }
    
    
}
