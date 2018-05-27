
package com.mlk.controllers;

import java.sql.Connection;
import java.sql.ResultSet;

public class GetMaxID {
    String sql;
    int maxID;
    public Integer getIntMaxID(String table,String colID){
        try {
            Connection c = DatabaseManager.getConnection();
            sql = "Select isnull(max("+colID+"),0)+ 1 as MaxiD from "+table+"";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if(rs.next()){
                return rs.getInt("MaxiD");
            }
        } catch (Exception e) {
        }
        return null;
    }
}
