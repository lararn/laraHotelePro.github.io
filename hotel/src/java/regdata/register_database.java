/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class register_database {
    
    
 public void input(String Name,String Location,String Tele,String Owner,String email) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
 {
     
 Class.forName("com.mysql.jdbc.Driver").newInstance();
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
 Statement st = conn.createStatement();
 String iq="INSERT INTO hotel_registration (Company_Name,Location,Contact_number,Owner_name,Email) VALUES ('" +Name +"','" +Location+"' ,'" +Tele +"' , '" +Owner+"', '"+email +"')";
  
 st.executeUpdate(iq);
 
 
 }

}
