package com.mlk.controllers;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\HMS/SQLDatasourse.accdb");
            sql = "SELECT * FROM tbl_Datasource where ID=1001";
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
    public String getUserPassword(String username) throws SQLException{
        String pw = null;
        Connection c = getConnection();
        Statement statement = c.createStatement();
        String query = "select * from tbl_UserLogin where UserName ='"+username+"'";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
           pw=rs.getString("UserPass").replaceAll(" ", "");
        }
        return pw;
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
