
package com.mlk.models;

public class RoomType {
    private int ID;
    private String name;
    private String notes;
    public RoomType(){
    }    
    public RoomType(int ID, String name, String notes){
        this.ID = ID;
        this.name = name;
        this.notes = notes;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
