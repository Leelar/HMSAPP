/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.controllers;

import com.mlk.models.Bed;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
            e.printStackTrace();
        }
        return false;
    }
}
