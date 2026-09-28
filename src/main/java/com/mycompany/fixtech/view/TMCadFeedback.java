/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Feedback;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadFeedback extends AbstractTableModel {
    private List<Feedback> lst;
    
    private final int COL_ID = 0;
    private final int COL_ATENDIMENTO = 1;
    private final int COL_NOTA = 2;
    private final int COL_COMENTARIO = 3;
  
    public TMCadFeedback(List<Feedback> lista) {
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
    
    public Feedback getObjetoFeedback(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Feedback a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdFeedback();
        }else if(columnIndex == COL_ATENDIMENTO){
            return a.getAtendimento();
        }else if(columnIndex == COL_NOTA){
            return a.getNota();
        }else if(columnIndex == COL_COMENTARIO){
            return a.getComentario();
        }
        return "-";
    }
    
    
    @Override
    public String getColumnName(int columnIndex) {
         if(columnIndex == COL_ID){
            return "Id";
        }else if(columnIndex == COL_ATENDIMENTO){
            return "Atendimento";
        }else if(columnIndex == COL_NOTA){
            return "Nota";
        }else if(columnIndex == COL_COMENTARIO){
            return "Comentario";
        }
        return "";
    }
}
