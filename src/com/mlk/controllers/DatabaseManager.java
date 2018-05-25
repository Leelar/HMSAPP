package com.mlk.controllers;

import com.mlk.models.DBConfiguration;
import com.mlk.models.Patient;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseManager {

    public DatabaseManager() {
    }
    public static Connection getConnection() {
        try {
            String serverName = "";
            String dbName = "";
            String userName = "";
            String password = "";
            String url;
            String sql;
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\HMS/Datasoure.accdb");
            sql = "SELECT * FROM tbl_Datasoure where ID=1001";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if (rs.next()) {
                serverName = "jdbc:sqlserver://" + rs.getString("Servername");
                dbName = rs.getString("DatabaseName");
                userName = rs.getString("UserName");
                password = rs.getString("Password");
            }
            url = serverName + ";" + "DatabaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, userName, password);
            return c;

        } catch (Exception e) {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
        return null;
    }
    public static Connection getAccessDB() {
        try {
            String url = "jdbc:ucanaccess://C:\\HMS/SQLDatasourse.accdb";
            Connection c = DriverManager.getConnection(url);
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean testConnection(DBConfiguration df) {
        try {
            String url = "jdbc:sqlserver://" + df.getServerName() + ";DatabaseName=" + df.getDatabaseName() + "";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(url, df.getUserName(), df.getPassword());
            if (c != null) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public boolean saveConnection(DBConfiguration df) {
        try {
            Connection c = getAccessDB();
            String sql = "update Tbl_Datasource set ServerName=?,DatabaseName=?,UserName=?,Password=? where ID=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, df.getServerName());
            p.setString(2, df.getDatabaseName());
            p.setString(3, df.getUserName());
            p.setString(4, df.getPassword());
            p.setInt(5, 1001);
            if(p.executeUpdate()!=-1){
                infoMsg("Successful");
            }else{
                waringMsg("Failed");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void readConnection(DBConfiguration df){
        try {
            Connection c = getAccessDB();
            String sql = "Select * from Tbl_Datasource where ID=1001";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if(rs.next()){
                df.setServerName(rs.getString("ServerName"));
                df.setDatabaseName(rs.getString("DatabaseName"));
                df.setUserName(rs.getString("UserName"));
                df.setPassword(rs.getString("Password"));
            }
        } catch (Exception e) {
        }
    }
    public void infoMsg(String info){
        JOptionPane.showMessageDialog(null, info,"Info message",JOptionPane.INFORMATION_MESSAGE);
    }
    public void waringMsg(String warning){
        JOptionPane.showMessageDialog(null, warning,"Warning message",JOptionPane.WARNING_MESSAGE);
    }
//    public void insert(Patient pa) throws ClassNotFoundException, SQLException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
//        if (conn != null) {
//            System.out.println("Succesfull!");
//            String queryString = "INSERT INTO Patient (code, name, surname, gender) "
//                    + "VALUES(?,?, ?,?)";
//            PreparedStatement preparedStmt = conn.prepareStatement(queryString);
//            preparedStmt.setString(1, pa.getCode());
//            preparedStmt.setString(2, pa.getName());
//            preparedStmt.setString(3, pa.getSurname());
//            preparedStmt.setString(4, pa.getGender());
//            preparedStmt.execute();
//            conn.close();
//        } else {
//            System.out.println("Failed");
//        }
//    }

//   public Exam createExamObj(String eid) throws SQLException, ClassNotFoundException, ParseException
//   {
//	   String cid=null; 
//	   Date starttime=null, endtime=null;   
//	   int maxnum=0, number=0;    
//	   String period=null;
//	   String paper=null;
//	   DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//	   
//	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	   conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);
//	   
//       Statement statement = conn.createStatement();
//       String queryString = "select * from Exam where eid = '"+eid+"';";
//       ResultSet rs = statement.executeQuery(queryString);
//       while (rs.next()) {
//          cid=rs.getString(2).replaceAll(" ", "");
//          starttime=sdf.parse(rs.getString(3));
//          maxnum=rs.getInt(4);
//          number=rs.getInt(5);
//          paper = rs.getString(6).replaceAll(" ", "");
//          period = rs.getString(7).replaceAll(" ", "");
//          endtime=sdf.parse(rs.getString(8));
//       }
//       Exam exm = new Exam(eid,cid,starttime,maxnum,number,paper,period,endtime);
//       return exm;
//   }
//   public Student createStudentObj(String username) throws SQLException, ClassNotFoundException, ParseException
//   {
//	   String matricno=null, password=null, realname=null;
//	   byte [] profilepic=null;
//	   
//	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	   conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);   
//           Statement statement = conn.createStatement();
//           String queryString = "select * from Student where username = '"+username+"';";
//           ResultSet rs = statement.executeQuery(queryString);
//            while (rs.next()) {
//            matricno=rs.getString(1).replaceAll(" ", "");
//            password=rs.getString(3).replaceAll(" ", "");
//            realname=rs.getString(4).replaceAll(" ", "");
//            profilepic=rs.getBytes(5);
//          }
//          Student std=new Student(matricno,username,password,realname,profilepic);
//          return std;
//   }
//   
//   public Course createCourseObj(String cid) throws SQLException, ClassNotFoundException, ParseException
//   {
//	   String cname=null, description=null;
//	   
//	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	   conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);
//	   
//       Statement statement = conn.createStatement();
//       String queryString = "select * from Course where cid = '"+cid+"';";
//       ResultSet rs = statement.executeQuery(queryString);
//       while (rs.next()) {
//          cname=rs.getString(2).replaceAll(" ", "");
//          description=rs.getString(3);
//       }
//       Course cs = new Course(cid, cname, description);
//       return cs;
//   }
//   
//   public Proctor createProctorObj(String username) throws SQLException, ClassNotFoundException, ParseException
//   {
//	   String pid=null, password=null, realname=null;
//	   byte [] profilepic=null;
//	   
//	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	   conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);
//	   
//       Statement statement = conn.createStatement();
//       String queryString = "select * from Proctor where username = '"+username+"' ;";
//       ResultSet rs = statement.executeQuery(queryString);
//       while (rs.next()) {
//          pid=rs.getString(1).replaceAll(" ", "");
//          password=rs.getString(3).replaceAll(" ", "");
//          realname=rs.getString(4).replaceAll(" ", "");
//          profilepic=rs.getBytes(5); 
//       }
//       Proctor pro=new Proctor(pid,username,password,realname,profilepic);
//       return pro;
//   }
}
