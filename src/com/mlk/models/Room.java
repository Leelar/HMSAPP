package com.mlk.models;

public class Room {

    private int roomID;
    private int deptID;
    private String RoomCode;
    private int roomType;
    private int Qty;
    private double Price;
    private String Note;

    public Room() {
    }

    public Room(int rid, int deptID, String roomcode, int rtype, int Qty, double Price, String Note) {
        this.roomID = rid;
        this.roomType = rtype;
        this.RoomCode = roomcode;
        this.Qty = Qty;
        this.Price = Price;
        this.Note = Note;
        this.deptID = deptID;
    }

    public int getRoomID() {
        return roomID;
    }

    public int getRoomType() {
        return roomType;
    }

    public String getRoomCode() {
        return RoomCode;
    }

    public int getQty() {
        return Qty;
    }

    public double getPrice() {
        return Price;
    }

    public String getNote() {
        return Note;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public void setRoomCode(String RoomCode) {
        this.RoomCode = RoomCode;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

}
