/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.models;

/**
 *
 * @author nnp1
 */
public class Bed {
    private String bedID;
    private String roomID;
    private boolean bedStatus;
    public static int noOfBedOccupied = 0;
    //constructor
    public Bed(String bid, String rid ){
        this.bedID = bid;
        this.bedStatus = false;
        this.roomID = rid;
    }
    
    //method getters and setters

    public String getBedID() {
        return bedID;
    }

    public String getRoomID() {
        return roomID;
    }

    public boolean getBedStatus() {
        return bedStatus;
    }
    public boolean isOccupied(){
        return this.getBedStatus();
    }

    public void setBedID(String bedID) {
        this.bedID = bedID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setBedStatus(boolean bedStatus) {
        this.bedStatus = bedStatus;
    }
    public void setOccupied(){
        this.setBedStatus(true);
        noOfBedOccupied++;
    }
    public void setReleased(){
        this.setBedStatus(false);
        noOfBedOccupied--;
    }    
    
    
}
