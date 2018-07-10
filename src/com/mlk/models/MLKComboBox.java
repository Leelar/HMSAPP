package com.mlk.models;

import java.util.ArrayList;

public class MLKComboBox {

    private String tblName;
    private String colId;
    private String colName;
    private ArrayList<ComboData> data;

    public MLKComboBox() {

    }

    public MLKComboBox(String tblName, String colId, String colName) {
        this.tblName = tblName;
        this.colId = colId;
        this.colName = colName;
    }

    public MLKComboBox(String tblName, String colId, String colName, ArrayList<ComboData> data) {
        this.tblName = tblName;
        this.colId = colId;
        this.colName = colName;
        this.data = data;
    }

    public String getTblName() {
        return tblName;
    }

    public String getColId() {
        return colId;
    }

    public String getColName() {
        return colName;
    }

    public ArrayList getData() {
        return this.data;
    }

    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    public void setColId(String colId) {
        this.colId = colId;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public void setData(ArrayList<ComboData> data) {
        this.data = data;
    }

    public String getQryString() {
        return "select " + this.colId + ", " + this.colName + " from " + this.getTblName() + " Order by " + this.colId + " ASC";
    }

    public int getIdByIndex(int index) {
        return Integer.parseInt(this.data.get(index).getId());
    }

    public String getValueByIndex(int index) {
        return this.data.get(index).getValue();
    }

    public int getIndexById(int id) {
        for (ComboData cmb : this.data) {
            if (cmb.getId().equals(String.valueOf(id).trim())) {
                return this.data.indexOf(cmb);
            }
        }
        return 0;
    }

    public String getValueById(int id) {
        for (ComboData cmb : this.data) {
            if (cmb.getId().equals(String.valueOf(id).trim())) {
                return cmb.getValue();
            }
        }
        return null;
    }

}
