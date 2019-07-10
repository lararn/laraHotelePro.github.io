/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class guest_database {
    
      public void input(String fName,String lName,String country,String dob) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
 {
     
 Class.forName("com.mysql.jdbc.Driver").newInstance();
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
 Statement st = conn.createStatement();
 String iq="INSERT INTO guest_details (First_name,Last_name,Country,DOB) VALUES ('" +fName +"','" +lName+"' ,'" +country +"' , '" +dob+"')";
  
 st.executeUpdate(iq);
 
 
 }
    
}
