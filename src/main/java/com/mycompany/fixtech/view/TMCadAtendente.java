/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Atendente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadAtendente extends AbstractTableModel {
    private List<Atendente> lst;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_LOGIN = 2;
    private final int COL_SENHA = 3;
  
    public TMCadAtendente(List<Atendente> lista) {
        this.lst = lista;
    }
    
    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    public Atendente getObjetoAtendente(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendente a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdAtendente();
        }else if(columnIndex == COL_NOME){
            return a.getNome();
        }else if(columnIndex == COL_LOGIN){
            return a.getLogin();
        }else if(columnIndex == COL_SENHA){
            return a.getSenha();
        }
        return "-";
    }
    
    
    @Override
    public String getColumnName(int columnIndex) {
         if(columnIndex == COL_ID){
            return "Id";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_LOGIN){
            return "Login";
        }else if(columnIndex == COL_SENHA){
            return "Senha";
        }
        return "";
    }
}
