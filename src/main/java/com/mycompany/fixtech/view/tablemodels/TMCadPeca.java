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
    private List<Object> lst;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_QUANTIDADE = 2;
    private final int COL_VALORUNIDADE = 3;
  
    public TMCadPeca(List<Object> lista) {
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
       return (Peca) this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Peca a = (Peca)this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdPeca();
        }else if(columnIndex == COL_NOME){
            return a.getNome();
        }else if(columnIndex == COL_QUANTIDADE){
            return a.getQuantidade();
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
        }else if(columnIndex == COL_QUANTIDADE){
            return "Quantidade";
        }else if(columnIndex == COL_VALORUNIDADE){
            return "ValorUnidade";
        }
        return "";
    }
}
