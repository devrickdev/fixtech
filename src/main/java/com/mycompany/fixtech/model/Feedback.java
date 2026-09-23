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
    public int idFeedback;
    public Atendimento atendimento;
    public int nota;
    public String comentario;

    public Feedback() {
        this.idFeedback = 0;
        this.atendimento = new Atendimento();
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
