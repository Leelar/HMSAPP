package com.mlk.controllers;

import com.mlk.models.Room;
import com.xzq.osc.JocTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class RoomManager {

    public RoomManager() {

    }

    public boolean insert(Room rm) {
        try {
            Connection c = DatabaseManager.getConnection();
            GetMaxID gm = new GetMaxID();
            int maxID = gm.getIntMaxID("tbl_Room", "RoomID");
            String insert = "insert into tbl_Room(RoomID, DeptID, RoomCode, RTypeID, Qty, Price, Note)values(?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            p.setInt(1, maxID);
            p.setInt(2, rm.getDeptID());
            p.setString(3, rm.getRoomCode());
            p.setInt(4, rm.getRoomType());
            p.setInt(5, rm.getQty());
            p.setDouble(6, rm.getPrice());
            p.setString(7, rm.getNote());
            return p.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Room rm) {
        try {
            Connection c = DatabaseManager.getConnection();
            String update = "update tbl_Room set DeptID=?, RoomCode=?, RTypeID=?, Qty=?, Price=?, Note=? where RoomID= ?";
            PreparedStatement p = c.prepareStatement(update);
            p.setInt(1, rm.getDeptID());
            p.setString(2, rm.getRoomCode());
            p.setInt(3, rm.getRoomType());
            p.setInt(4, rm.getQty());
            p.setDouble(5, rm.getPrice());
            p.setString(6, rm.getNote());
            p.setInt(7, rm.getRoomID());
            return p.executeUpdate() == 1;

        } catch (Exception e) {
        }
        return false;
    }

    public boolean delete(int id) {
        try {
            Connection c = DatabaseManager.getConnection();
            String delete = "delete tbl_Room  where RoomID= " + id + "";
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
    public void load(DefaultTableModel model){
        try {
             Connection c = DatabaseManager.getConnection();
            String query = "SELECT   dbo.tbl_Room.RoomID, dbo.tbl_Room.RoomCode, dbo.tbl_RoomType.RTypeName, dbo.tbl_Room.Qty,\n" +
                     " dbo.tbl_Room.Price, dbo.tbl_Department.DeptName, dbo.tbl_Room.Note FROM dbo.tbl_Room INNER JOIN\n" +
                     " dbo.tbl_RoomType ON dbo.tbl_Room.RTypeID = dbo.tbl_RoomType.RTypeID INNER JOIN\n" +
                     " dbo.tbl_Department ON dbo.tbl_Room.DeptID = dbo.tbl_Department.DeptID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("RoomID");
                 String roomCode = rs.getString("RoomCode");
                String roomType = rs.getString("RTypeName");
                String qty = rs.getString("Qty");
                String price = rs.getString("Price");
                String dept = rs.getString("DeptName");
                String note = rs.getString("Note");
                model.addRow(new Object[]{id,roomCode,roomType,qty,price,dept ,note});
            }
            rs.close();
            c.close();
        } catch (Exception e) {
        }
    }
    public ArrayList<Integer> configCMB(JComboBox<String> cmb, String tbName, String colId, String colName){
        try {
            ArrayList<Integer> array = new ArrayList<>();
            Connection c = DatabaseManager.getConnection();
            String query = "Select "+colId+", "+colName+" from "+tbName+" Order by "+colId+" ASC";
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                array.add(rs.getInt(colId));
                mode.addElement(rs.getString(colName));
            }
            cmb.setModel(mode);
            return array;
        } catch (Exception e) {
        }
        return null;
    }
    public Room getRoomObject(int id){
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Room Where RoomID= " + id + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            Room rm = new Room();
            while(rs.next()){
                rm.setRoomID(rs.getInt("RoomID"));
                rm.setDeptID(rs.getInt("DeptID"));
                rm.setRoomCode(rs.getString("RoomCode"));
                rm.setRoomType(rs.getInt("RTypeID"));
                rm.setQty(rs.getInt("Qty"));
                rm.setPrice(rs.getDouble("Price"));
                rm.setNote(rs.getString("Note"));
            }
            return rm;
        } catch (Exception e) {
        }
        return new Room();
    }
}
