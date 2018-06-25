
package com.mlk.controllers;

public class Login {
    private String userName;
    private String password;
    DatabaseManager dm = new DatabaseManager();
    public Login(){
        
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    public boolean verifyUser(){
        String dbPass=null;
        try {
            dbPass=dm.getUserPassword(userName);
            
        } catch (Exception e) {
        }
        return this.password.equals(dbPass);
    }
}
