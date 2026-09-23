/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Administrador;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadAdm extends AbstractTableModel {
    private List<Administrador> lst;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_LOGIN = 2;
    private final int COL_SENHA = 3;
  
    public TMCadAdm(List<Administrador> lista) {
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
    
    public Administrador getObjetoAdm(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Administrador a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdAdm();
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
        //qual o nome da coluna
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
