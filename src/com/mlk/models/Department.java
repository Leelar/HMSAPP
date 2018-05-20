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
public class Department {
    private String deptID;
    private String deptLaoName;
    private String deptEngName;
    //constructor
    public Department(String did, String deptLaoName, String deptEngName){
        this.deptID = did;
        this.deptLaoName = deptLaoName;
        this.deptEngName = deptEngName;
    }
    //getters and setters

    public String getDeptID() {
        return deptID;
    }

    public String getDeptLaoName() {
        return deptLaoName;
    }

    public String getDeptEngName() {
        return deptEngName;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public void setDeptLaoName(String deptLaoName) {
        this.deptLaoName = deptLaoName;
    }

    public void setDeptEngName(String deptEngName) {
        this.deptEngName = deptEngName;
    }
    
    
}
