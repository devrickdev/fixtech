/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.model;


/**
 *
 * @author henry
 */
public class Feedback {
    private int idFeedback;
    private Atendimento atendimento;
    private int nota;
    private String comentario;

    public Feedback(int idFeedback, Atendimento atendimento, int nota, String comentario) {
        this.idFeedback = idFeedback;
        this.atendimento = atendimento;
        this.nota = nota;
        this.comentario = comentario;
    }
    
    public Feedback() {
        this.idFeedback = 0;
        this.nota = 0;
        this.comentario = "";
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
    
    public int getAtendimentoId() {
        return atendimento.getIdAtendimento();
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
    
    public int getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(int idFeedback) {
        this.idFeedback = idFeedback;
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
