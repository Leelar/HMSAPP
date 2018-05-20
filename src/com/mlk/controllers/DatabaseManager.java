package com.mlk.controllers;

import com.mlk.models.Patient;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatabaseManager {

    String db_connect_string = "jdbc:sqlserver://KOR-PC:1433;databaseName=hmsdb;selectMethod=cursor";
    String db_userid = "sa";
    String db_password = "kor";
    Connection conn = null;

    public DatabaseManager() {
    }

//    public String getPassword(String domain, String username) throws SQLException, ClassNotFoundException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
//        String pw = null;
//        Statement statement = conn.createStatement();
//        String queryString = "select * from " + domain + " where username = '" + username + "';";
//        ResultSet rs = statement.executeQuery(queryString);
//        while (rs.next()) {
//            pw = rs.getString(3).replaceAll(" ", "");
//        }
//        return pw;
//    }
    public void insert(Patient pa) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
        if (conn != null) {
            System.out.println("Succesfull!");
            String queryString = "INSERT INTO Patient (code, name, surname, gender) "
                    + "VALUES(?,?, ?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(queryString);
            preparedStmt.setString(1, pa.getCode());
            preparedStmt.setString(2, pa.getName());
            preparedStmt.setString(3, pa.getSurname());
            preparedStmt.setString(4, pa.getGender());
            preparedStmt.execute();
            conn.close();
        } else {
            System.out.println("Failed");
        }
    }

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
