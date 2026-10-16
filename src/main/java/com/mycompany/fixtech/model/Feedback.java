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
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFeedback;
    @ManyToOne(fetch = FetchType.LAZY)
    private Atendimento atendimento;
    private int nota;
    private String comentario;
    
    public Feedback() {}
    
    public Feedback(Long idFeedback, Atendimento atendimento, int nota, String comentario) {
        this.idFeedback = idFeedback;
        this.atendimento = atendimento;
        this.nota = nota;
        this.comentario = comentario;
    }
    
    @Override
    public String toString(){
        String txt = "---- Dados do Feedback ----\n"
        +"idFeedback: " + this.idFeedback + "\n"
        +"Nota: "+ this.nota + "\n"
        +"Comentario: " + this.comentario;
        txt += atendimento.toString();      
        return txt;
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
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
    
}
