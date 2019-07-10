/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class flight_database {
      public void input(String adate,String atime,String ddate,String dtime) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
 {
     
 Class.forName("com.mysql.jdbc.Driver").newInstance();
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
 Statement st = conn.createStatement();
 String iq="INSERT INTO fligth_details (Arival_date,Arival_time,Depature_date,Depature_time) VALUES ('" +adate +"','" +atime+"' ,'" +ddate+"' , '" +dtime+"')";
  
 st.executeUpdate(iq);
 
 
 }
}
