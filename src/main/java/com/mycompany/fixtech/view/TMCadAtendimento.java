/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Atendimento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadAtendimento extends AbstractTableModel {
    private final List<Atendimento> lst;
    
    private final int COL_ID = 0;
    private final int COL_CLIENTE = 1;
    private final int COL_ATENDENTE = 2;
    private final int COL_DISPOSITIVO = 4;
    private final int COL_STATUS = 5;
    private final int COL_DESCRICAO = 6;
    
    public TMCadAtendimento(List<Atendimento> lista) {
        this.lst = lista;
    }
    
    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    public Atendimento getObjetoAtendimento(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendimento a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdAtendimento();
        }else if(columnIndex == COL_CLIENTE){
            return a.getCliente();
        }else if(columnIndex == COL_ATENDENTE){
            return a.getAtendente();
        }else if(columnIndex == COL_DISPOSITIVO){
            return a.getDispositivo();
        }else if(columnIndex == COL_STATUS){
            return a.getStatus();
        }else if(columnIndex == COL_DESCRICAO){
            return a.getStatus();
        }
        return "-";
    }
    
    
    @Override
    public String getColumnName(int columnIndex) {
         if(columnIndex == COL_ID){
            return "Id";
        }else if(columnIndex == COL_CLIENTE){
            return "Cliente";
        }else if(columnIndex == COL_ATENDENTE){
            return "Atendente";
        }else if(columnIndex == COL_DISPOSITIVO){
            return "Dispositivo";
        }else if(columnIndex == COL_STATUS){
            return "Status";
        }else if(columnIndex == COL_DESCRICAO){
            return "Descricao";
        }
        return "";
    }
}
