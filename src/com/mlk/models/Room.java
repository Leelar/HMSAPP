/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.models;

import java.util.ArrayList;

/**
 *
 * @author nnp1
 */
public class Room {
    private String roomID;
    private int roomType;
    private String deptID;
    private ArrayList<Bed> bedList ;

    public Room(String rid,int rtype, String did, ArrayList<Bed> blist){
        this.roomID = rid;
        this.roomType = rtype;
        this.deptID = did;
        this.bedList = blist;
    }

    public String getRoomID() {
        return roomID;
    }

    public int getRoomType() {
        return roomType;
    }

    public String getDeptID() {
        return deptID;
    }
    public boolean isFull(){
        return false;
    }
    public ArrayList<Bed> getBedList() {
        return bedList;
    }
    //Setters
    public void setRoomID(String rid){
        this.roomID = rid;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }
    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }
    public void setBedList(ArrayList<Bed> bedList) {
        this.bedList = bedList;
    }
    
    
}
