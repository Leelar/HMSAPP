/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.controllers;

import com.mlk.models.Bed;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BedManager {
    public BedManager(){
        
    }
    public boolean insert(Bed b){
        try {
            Connection c = DatabaseManager.getConnection();
            GetMaxID gm = new GetMaxID();
            int maxID = gm.getIntMaxID("tbl_Bed", "BedID");
            String insert = "insert into tbl_Bed(BedID, RoomID,BedCode, Reserved, Note)values(?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, maxID);
            p.setInt(2, b.getRoomID());
            p.setString(3, b.getBedCode());
            p.setBoolean(4, b.isOccupied());
            p.setString(5, b.getNote());
            return p.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    public boolean update(Bed b) {
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "update tbl_Bed set BedID=?, RoomID=?, BedCode=?, Reserved=?, Note=? where BedID= ?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, b.getBedID());
            p.setInt(2, b.getRoomID());
            p.setString(3, b.getBedCode());
            p.setBoolean(4, b.isOccupied());
            p.setString(5, b.getNote());
            p.setInt(6, b.getBedID());
            return p.executeUpdate() == 1;

        } catch (Exception e) {
        }
        return false;
    }
    public boolean delete(int id) {
        try {
            Connection c = DatabaseManager.getConnection();
            String delete = "delete tbl_Bed  where BedID= " + id + "";
            PreparedStatement p = c.prepareStatement(delete);
            return p.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    public void refresh(JTable table, DefaultTableModel model) {
        this.clear(table, model);
        this.load(model);
    }

    public void clear(JTable table, DefaultTableModel model) {
        int index = table.getRowCount() - 1;
        while (index > -1) {
            model.removeRow(index--);
        }

    }

    public void load(DefaultTableModel model) {
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "SELECT Reserved, BedID, BedCode, Note FROM tbl_Bed";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                boolean reserved = rs.getBoolean("Reserved");
                int bId = rs.getInt("BedID");
                String bCode = rs.getString("BedCode");
                String Note = rs.getString("Note");
                model.addRow(new Object[]{reserved, bId, bCode, Note});
            }
            rs.close();
            c.close();
        } catch (Exception e) {
        }
    }
    public Bed getBedObject(int id) {
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Bed Where BedID= " + id + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            Bed b = new Bed(id);
            while (rs.next()) {
                b.setRoomID(rs.getInt("RoomID"));
                b.setBedCode(rs.getString("BedCode"));
                b.setNote(rs.getString("Note"));
            }
            return b;
        } catch (Exception e) {
        }
        return null;
    }
}
