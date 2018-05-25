/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.models;

/**
 *
 * @author Programming
 */
public class DBConfiguration {
    private String serverName;
    private String databaseName;
    private String userName;
    private String password;
    public DBConfiguration(){
        
    }
    public DBConfiguration(String sName, String dName, String uName, String pwd){
        this.serverName = sName;
        this.databaseName = dName;
        this.userName = uName;
        this.password = pwd;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServerName() {
        return serverName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
