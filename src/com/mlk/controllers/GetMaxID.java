
package com.mlk.controllers;

public class GetMaxID {
    String sql;
    int maxID;
    public Integer getMaxID(String table,String colID,Integer number){
        try {

            sql = "Select isnull(max("+colID+"),0)+"+number+" as MaxiD from "+table+"";

        } catch (Exception e) {
        }
        return maxID;
    }
}
