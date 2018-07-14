package com.mlk.controllers;

import com.mlk.models.Bed;
import com.mlk.models.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class RoomManager {

    private HashMap<Integer, String> dept;
    private HashMap<Integer, String> roomtype;
    private final BedManager bmngr = new BedManager();

    public RoomManager() {
        dept = new HashMap<>();
        roomtype = new HashMap<>();
    }

    public boolean insert(Room rm) {
        try {
            Connection c = DatabaseManager.getConnection();
            GetMaxID gm = new GetMaxID();
            int maxID = gm.getIntMaxID("tbl_Room", "RoomID");
            String insert = "insert into tbl_Room(RoomID, DeptID, RoomCode, RTypeID, Qty, Price, Note)values(?,?,?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(insert);
            rm.setRoomID(maxID);
            p.setInt(1, rm.getRoomID());
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
    public boolean addBed( Bed b){     
        return bmngr.insert(b);
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
    public boolean updateBed(Bed b){
        return bmngr.update(b);
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
    public boolean deleteBed(int id){
        return bmngr.delete(id);
    }

    public void refresh(JTable table, DefaultTableModel model) {
        this.clear(table, model);
        this.load(model);
    }
    public void refreshBed(JTable table, DefaultTableModel model){
        bmngr.refresh(table, model);
    }
    public void refreshBed(JTable table, DefaultTableModel model, int room_id){
        bmngr.refresh(table, model,room_id);
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
            String query = "SELECT   dbo.tbl_Room.RoomID, dbo.tbl_Room.RoomCode, dbo.tbl_RoomType.RTypeName, dbo.tbl_Room.Qty,\n"
                    + " dbo.tbl_Room.Price, dbo.tbl_Department.DeptName, dbo.tbl_Room.Note FROM dbo.tbl_Room INNER JOIN\n"
                    + " dbo.tbl_RoomType ON dbo.tbl_Room.RTypeID = dbo.tbl_RoomType.RTypeID INNER JOIN\n"
                    + " dbo.tbl_Department ON dbo.tbl_Room.DeptID = dbo.tbl_Department.DeptID";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("RoomID");
                String roomCode = rs.getString("RoomCode");
                String roomType = rs.getString("RTypeName");
                int qty = rs.getInt("Qty");
                double price = rs.getDouble("Price");
                String department = rs.getString("DeptName");
                String note = rs.getString("Note");
                model.addRow(new Object[]{id, roomCode, roomType, qty, price, department, note});
            }
            rs.close();
            c.close();
        } catch (Exception e) {
        }
    }

    public ArrayList<Room> searchRoom(String keyword) {
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "SELECT * FROM tbl_Room WHERE RoomID LIKE '%" + keyword + "%' OR RoomCode LIKE '%" + keyword + "%'";
            ResultSet rs = c.createStatement().executeQuery(query);
            ArrayList<Room> data = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("RoomID");
                String roomCode = rs.getString("RoomCode");
                int roomType = rs.getInt("RTypeID");
                int qty = rs.getInt("Qty");
                double price = rs.getDouble("Price");
                int dept = rs.getInt("DeptID");
                String note = rs.getString("Note");
                data.add(new Room(id, dept, roomCode, roomType, qty, price, note));
            }
            return data;
        } catch (Exception e) {
        }
        return null;
    }
    public void configComboBoxes() {
        try {
            Connection c1 = DatabaseManager.getConnection();
            String query1 = "Select RTypeID,RTypeName from tbl_RoomType Order by RTypeID ASC";
            ResultSet rs1 = c1.createStatement().executeQuery(query1);
            while (rs1.next()) {
                this.roomtype.put(rs1.getInt("RTypeID"),rs1.getString("RTypeName"));
            }
            rs1.close();
            c1.close();

            Connection c2 = DatabaseManager.getConnection();
            String query2 = "Select DeptID,DeptName from tbl_Department Order by DeptID ASC";
            ResultSet rs2 = c2.createStatement().executeQuery(query2);
            while (rs2.next()) {
                this.dept.put(rs2.getInt("DeptID"), rs2.getString("DeptName"));
            }
            rs2.close();
            c2.close();
        } catch (Exception e) {
        }
    }
    public DefaultComboBoxModel getComboBoxModel(String tblName, String colId, String colName) {
        try {
            Connection c = DatabaseManager.getConnection();
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            String query = "Select "+colId+", "+colName + " from "+tblName+" Order by "+colId+" ASC";
            ResultSet rs = c.createStatement().executeQuery(query);
            while (rs.next()) {
                mode.addElement(rs.getString(colName));
            }
            return mode;
        } catch (Exception e) {
        }
        return null;
    }
    public String getDeptValue(int key ){
        return (String)this.dept.get(key);
    }
    public int getDeptID(String value){
        Set set = this.dept.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterator.next();
                if(value.equals(mentry.getValue())){
                    return (int)mentry.getKey();
                }
             }
        return 0;
    }
    public String getRoomTypeValue(int id ){
        return (String) this.roomtype.get(id);
    }
    public int getRoomTypeID(String value){
        Set set = this.roomtype.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry)iterator.next();
                if(value.equals(mentry.getValue())){
                    return (int)mentry.getKey();
                }
             }
        return 0;
    }
    public Room getRoomObject(int id) {
        try {
            Connection c = DatabaseManager.getConnection();
            String query = "Select * from tbl_Room Where RoomID= " + id + "";
            ResultSet rs = c.createStatement().executeQuery(query);
            Room rm = new Room();
            while (rs.next()) {
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
        return null;
    }
    public Bed getBedObject(int id){
        return bmngr.getBedObject(id);
    }
}
