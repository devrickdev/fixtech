/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixtech.view;

import com.mycompany.fixtech.model.Dispositivo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henry
 */
public class TMCadDispositivo extends AbstractTableModel {
    private List<Dispositivo> lst;
    
    private final int COL_ID = 0;
    private final int COL_TIPO = 1;
    private final int COL_MARCA = 2;
    private final int COL_MODELO = 3;
  
    public TMCadDispositivo(List<Dispositivo> lista) {
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
    
    public Dispositivo getObjetoDispositivo(int row){
       return this.lst.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dispositivo a = this.lst.get(rowIndex);
         if(columnIndex == COL_ID){
            return a.getIdDispositivo();
        }else if(columnIndex == COL_TIPO){
            return a.getTipo();
        }else if(columnIndex == COL_MARCA){
            return a.getMarca();
        }else if(columnIndex == COL_MODELO){
            return a.getModelo();
        }
        return "-";
    }
    
    public String getColumnName(int columnIndex) {
         if(columnIndex == COL_ID){
            return "Id";
        }else if(columnIndex == COL_TIPO){
            return "Tipo";
        }else if(columnIndex == COL_MARCA){
            return "Marca";
        }else if(columnIndex == COL_MODELO){
            return "Modelo";
        }
        return "";
    }
}
