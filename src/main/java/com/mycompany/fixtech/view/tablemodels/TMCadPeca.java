/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view.tablemodels;

import com.mycompany.fixtech.model.Peca;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadPeca extends AbstractTableModel {
    private final List<Peca> lst;
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_ESTOQUE = 2;
    private static final int COL_VALORUNIDADE = 3;
  
    public TMCadPeca(List<Peca> lista) {
        this.lst = lista;
    }
    
    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public Peca getObjetoPeca(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Peca a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdPeca();
        }else if(columnIndex == COL_NOME){
            return a.getNome();
        }else if(columnIndex == COL_ESTOQUE){
            return a.getEstoque();
        }else if(columnIndex == COL_VALORUNIDADE){
            return a.getValorUnidade();
        }
        return "-";
    }
    
    public String getColumnName(int columnIndex) {
         if(columnIndex == COL_ID){
            return "Id";
        }else if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_ESTOQUE){
            return "Estoque";
        }else if(columnIndex == COL_VALORUNIDADE){
            return "ValorUnidade";
        }
        return "";
    }
}
