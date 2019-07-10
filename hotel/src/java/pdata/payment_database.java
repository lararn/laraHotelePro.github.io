/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class payment_database {
    
      public void input(String card,String cno,String cname,String exdate,String address,String phone) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
 {
     
 Class.forName("com.mysql.jdbc.Driver").newInstance();
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
 Statement st = conn.createStatement();
 String iq="INSERT INTO payment_details (card_type,Card_number,Card_name,Expire_date) VALUES ('" +card +"','" +cno+"' ,'" +cname +"' , '" +exdate+"')";
  
 st.executeUpdate(iq);
 
 
 }
}
