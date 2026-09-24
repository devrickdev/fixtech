/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadCliente extends AbstractTableModel{
    private List<Cliente> lst;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_LOGIN = 2;
    private final int COL_SENHA = 3;
    private final int COL_TELEFONE = 4;
    private final int COL_ENDERECO = 5;
  
    public TMCadCliente(List<Cliente> lista) {
        this.lst = lista;
    }
    
    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    public Cliente getObjetoCliente(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Cliente a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdCliente();
        }else if(columnIndex == COL_NOME){
            return a.getNome();
        }else if(columnIndex == COL_LOGIN){
            return a.getLogin();
        }else if(columnIndex == COL_SENHA){
            return a.getSenha();
        }else if(columnIndex == COL_TELEFONE){
            return a.getSenha();
        }else if(columnIndex == COL_ENDERECO){
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
        }else if(columnIndex == COL_TELEFONE){
            return "Senha";
        }else if(columnIndex == COL_ENDERECO){
            return "Senha";
        }
        return "";
    }
}
