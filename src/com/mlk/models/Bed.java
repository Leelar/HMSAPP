
package com.mlk.models;
public class Bed {
    private int bedID;
    private int roomID;
    private String bedCode;
    private boolean bedStatus;
    private String note;
    private static int noOfBedOccupied = 0;
    public Bed(){
        this.bedStatus = false;
    }
    public Bed(int bid){
        this.bedID = bid;
        this.bedStatus = false;
    }
    public Bed(int bid, int rid, String bCode){
        this.bedID = bid;
        this.bedStatus = false;
        this.roomID = rid;
    }
    public Bed(int bid, int rid, String bCode, String note){
        this.bedID = bid;
        this.bedStatus = false;
        this.roomID = rid;
        this.note = note;
    }

    public int getBedID() {
        return bedID;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getBedCode() {
        return bedCode;
    }

    public boolean isBedStatus() {
        return bedStatus;
    }

    public String getNote() {
        return note;
    }

    public static int getNoOfBedOccupied() {
        return noOfBedOccupied;
    }

    public void setBedID(int bedID) {
        this.bedID = bedID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setBedCode(String bedCode) {
        this.bedCode = bedCode;
    }

    public void setNote(String note) {
        this.note = note;
    }
  
    private void setBedStatus(boolean bedStatus) {
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
