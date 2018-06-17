
package com.mlk.controllers;

public class LoginManager {
    private String userName;
    private String password;
    DatabaseManager dm =new DatabaseManager();
    public LoginManager(){     
    }
    public boolean verifyUser(){
        String dbPass = null;
        try {
         dbPass = dm.getUserPassword(userName);   
        } catch (Exception e) {
        } 
        return this.password.equals(dbPass);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
