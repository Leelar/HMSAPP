package com.mlk.controllers;

import com.mlk.models.Bed;
import com.mlk.models.ComboData;
import com.mlk.models.MLKComboBox;
import com.mlk.models.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class RoomManager {

    public MLKComboBox dept_cmb;
    public MLKComboBox roomtype_cmb;
    private BedManager bmngr = new BedManager();

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
                String dept = rs.getString("DeptName");
                String note = rs.getString("Note");
                model.addRow(new Object[]{id, roomCode, roomType, qty, price, dept, note});
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

    public void setRoomTypeMLKComboBox(MLKComboBox cmb) {
        this.roomtype_cmb = cmb;
    }

    public void setDeptMLKComboBox(MLKComboBox cmb) {
        this.dept_cmb = cmb;
    }

    public void configComboBoxes() {
        try {
            Connection c1 = DatabaseManager.getConnection();
            String query1 = "Select RTypeID,RTypeName from tbl_RoomType Order by RTypeID ASC";
            ResultSet rs1 = c1.createStatement().executeQuery(query1);
            ArrayList<ComboData> tmp1 = new ArrayList<>();
            while (rs1.next()) {
                ComboData data = new ComboData(String.valueOf(rs1.getInt("RTypeID")), rs1.getString("RTypeName"));
                tmp1.add(data);
            }
            this.roomtype_cmb.setData(tmp1);
            rs1.close();
            c1.close();

            Connection c2 = DatabaseManager.getConnection();
            String query2 = "Select DeptID,DeptName from tbl_Department Order by DeptID ASC";
            ResultSet rs2 = c2.createStatement().executeQuery(query2);
            ArrayList<ComboData> tmp2 = new ArrayList<>();
            while (rs2.next()) {
                ComboData data = new ComboData(String.valueOf(rs2.getInt("DeptID")), rs2.getString("DeptName"));
                tmp2.add(data);
            }
            this.dept_cmb.setData(tmp2);
            rs2.close();
            c2.close();
        } catch (Exception e) {
        }
    }

    public DefaultComboBoxModel getDeptComboBoxModel() {
        try {
            Connection c = DatabaseManager.getConnection();
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            ResultSet rs = c.createStatement().executeQuery(this.dept_cmb.getQryString());
            while (rs.next()) {
                mode.addElement(rs.getString(this.dept_cmb.getColName()));
            }
            return mode;
        } catch (Exception e) {
        }
        return null;
    }

    public DefaultComboBoxModel getRoomTypeComboBoxModel() {
        try {
            Connection c = DatabaseManager.getConnection();
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            ResultSet rs = c.createStatement().executeQuery(this.roomtype_cmb.getQryString());
            while (rs.next()) {
                mode.addElement(rs.getString(this.roomtype_cmb.getColName()));
            }
            return mode;
        } catch (Exception e) {
        }
        return null;
    }

    public String getDeptComboBoxValue(int id) {
        return this.dept_cmb.getValueById(id);
    }

    public int getDeptIdByIndex(int index) {
        return this.dept_cmb.getIdByIndex(index);
    }

    public int getDeptIndexById(int id) {
        return this.dept_cmb.getIndexById(id);
    }

    public String getRomTypeComboBoxValue(int id) {
        return this.roomtype_cmb.getValueById(id);
    }

    public int getRoomTypeIdByIndex(int index) {
        return this.roomtype_cmb.getIdByIndex(index);
    }

    public int getRoomTypeIndexById(int id) {
        return this.roomtype_cmb.getIndexById(id);
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
        return new Room();
    }
}
