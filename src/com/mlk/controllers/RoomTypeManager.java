package com.mlk.controllers;

import com.mlk.models.RoomType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class RoomTypeManager {
    public RoomTypeManager(){
        
    }
    public boolean insert(RoomType r_type){
        try {
            Connection c = DatabaseManager.getConnection();
            GetMaxID gm = new GetMaxID();
            int maxID = gm.getIntMaxID("tbl_RoomType", "RTypeID");
            String insert = "insert into tbl_RoomType(RTypeID,RTypeName,RTypeNotes)values(?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, maxID);
            p.setString(2, r_type.getName());
            p.setString(3, r_type.getNotes());
            return p.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(RoomType r_type){
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "Update tbl_RoomType set RTypeName=?,RTypeNotes=? where RTypeID=?";
            PreparedStatement p = c.prepareStatement(update);
            p.setString(1, r_type.getName());
            p.setString(2, r_type.getNotes());
            p.setInt(3, r_type.getID());
            return p.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete(int id){
        try {
            Connection c = DatabaseManager.getConnection();
            String delete = "Delete tbl_RoomType where RTypeID="+id+"";
            PreparedStatement p = c.prepareStatement(delete);
            return p.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    public void refresh(JTable table, DefaultTableModel model){
        this.clear(table, model);
        this.load(model);
    }
    public void clear(JTable table, DefaultTableModel model){
        int index = table.getRowCount()-1;
        while(index>-1){
            model.removeRow(index--);
        }        
    }
    public void load(DefaultTableModel model){
         try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select RTypeID,RTypeName,RTypeNotes from tbl_RoomType";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("RTypeID");
                String name = rs.getString("RTypeName");
                String note = rs.getString("RTypeNotes");
                model.addRow(new Object[]{id,name,note});
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
