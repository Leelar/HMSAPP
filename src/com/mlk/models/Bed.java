
package com.mlk.models;
public class Bed {
    private int bedID;
    private int roomID;
    private String bedCode;
    private boolean occupied;
    private String note;
    private static int noOfBedOccupied = 0;
    public Bed(){
        this.occupied = false;
    }
    public Bed(int bid){
        this.bedID = bid;
        this.occupied = false;
    }
    public Bed(int bid, int rid, String bCode){
        this.bedID = bid;
        this.occupied = false;
        this.roomID = rid;
    }
    public Bed(int bid, int rid, String bCode, String note){
        this.bedID = bid;
        this.occupied = false;
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

    public boolean isOccupied() {
        return occupied;
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
  
    private void setOccupied(boolean bedStatus) {
        this.occupied = bedStatus;
    }
    public void setOccupied(){
        this.setOccupied(true);
        noOfBedOccupied++;
    }
    public void setReleased(){
        this.setOccupied(false);
        noOfBedOccupied--;
    }    
    
    
}
