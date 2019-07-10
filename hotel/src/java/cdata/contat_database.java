/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class contat_database {
      public void input(String fname,String lname,String country,String email,String address,String phone) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
 {
     
 Class.forName("com.mysql.jdbc.Driver").newInstance();
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
 Statement st = conn.createStatement();
 String iq="INSERT INTO contact_details (First_name,Last_name,Country,Email,Address,Phone) VALUES ('" +fname +"','" +lname+"' ,'" +country +"' , '" +email+"', '"+address +"', '"+phone +"')";
  
 st.executeUpdate(iq);
 
 
 }
    
}
