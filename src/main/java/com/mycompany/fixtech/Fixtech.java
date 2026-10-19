/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fixtech;

import com.mycompany.fixtech.model.Atendimento;
import com.mycompany.fixtech.view.FrCadAdministrador;
import com.mycompany.fixtech.view.FrCadAtendente;
import com.mycompany.fixtech.view.FrCadCliente;
import com.mycompany.fixtech.view.FrCadDispositivo;
import com.mycompany.fixtech.view.FrCadPeca;
import com.mycompany.fixtech.view.FrHome;
import com.mycompany.fixtech.view.dialogs.DlgCadAtendimento;
import com.mycompany.fixtech.view.dialogs.DlgCadFeedback;
import javax.swing.JFrame;

/**
 *
 * @author henry
 */
public class Fixtech {

    public static void main(String[] args) {
        
        //DlgCadFeedback cadFeedback = new DlgCadFeedback(new JFrame(),true);
        //cadFeedback.setVisible(true);
        
        //Atendimento atendimento = new Atendimento();
        //DlgCadAtendimento cadAtendimento = new DlgCadAtendimento(new JFrame(),true,atendimento);
        //cadAtendimento.setVisible(true);
        
        //FrCadPeca cadPeca = new FrCadPeca();
        //cadPeca.setVisible(true);
        
        //FrCadDispositivo cadDispositivo = new FrCadDispositivo();
        //cadDispositivo.setVisible(true);
        
        //FrCadCliente cadCliente = new FrCadCliente();
        //cadCliente.setVisible(true);
        
        //FrCadAtendente cadAtendente = new FrCadAtendente();
        //cadAtendente.setVisible(true);
        
        //FrCadAdministrador cadAdm = new FrCadAdministrador();
        //cadAdm.setVisible(true);
        
        FrHome homePage = new FrHome();
        homePage.setVisible(true);
    }
}
