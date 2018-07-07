/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.controllers;

import static com.mlk.controllers.DatabaseManager.getAccessDB;
import com.mlk.utils.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    public boolean testConnection() {
        try {
            String url = "jdbc:sqlserver://" + this.getServerName() + ";DatabaseName=" + this.getDatabaseName() + "";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, this.getUserName(), this.getPassword());
            if (c != null) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public boolean saveConnection() {
        try {
            Connection c = getAccessDB();
            String sql = "update Tbl_Datasource set ServerName=?,DatabaseName=?,UserName=?,Password=? where ID=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, this.getServerName());
            p.setString(2, this.getDatabaseName());
            p.setString(3, this.getUserName());
            p.setString(4, this.getPassword());
            p.setInt(5, 1001);
            if(p.executeUpdate()!=-1){
                Util.infoMsg("Successful");
            }else{
                Util.warningMsg("Failed");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void readConnection(){
        try {
            Connection c = getAccessDB();
            String sql = "Select * from Tbl_Datasource where ID=1001";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if(rs.next()){
                this.setServerName(rs.getString("ServerName"));
                this.setDatabaseName(rs.getString("DatabaseName"));
                this.setUserName(rs.getString("UserName"));
                this.setPassword(rs.getString("Password"));
            }
        } catch (Exception e) {
        }
    }
    
    
}
