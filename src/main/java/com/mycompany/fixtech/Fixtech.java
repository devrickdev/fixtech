/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fixtech;


import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.view.FrCadDispositivo;
import com.mycompany.fixtech.view.dialogs.DlgCadAtendimento;
import javax.swing.JFrame;


/**
 *
 * @author henry
 */
public class Fixtech {
    public static void main(String[] args) {
        //FrCadDispositivo telaDispositivo = new FrCadDispositivo();
        //telaDispositivosetVisible(true);
        Atendimento atendimento = new Atendimento();
        DlgCadAtendimento TelaAtendimento = new DlgCadAtendimento(new JFrame(),true, atendimento);
        TelaAtendimento.setVisible(true);
    }
}

