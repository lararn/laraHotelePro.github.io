/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author user
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = request.getParameter("Usname");
        String psw = request.getParameter("Password");
//        
//        if("L@1234".equals(psw) && "Lara".equals(uname))
//        {
//            response.sendRedirect("index1.jsp");
//        }
//        else if("S@1234".equals(psw) && "Sandu".equals(uname))
//        {
//        
//            response.sendRedirect("addroom.jsp");
//        }
//        
//        else if("K@1234".equals(psw) && "Kasun".equals(uname))
//        {
//        
//            response.sendRedirect("reservation.jsp");
//        }
//          else
//        {
//            response.sendRedirect("loginerror.jsp");
//        }
//        
        
      
        
             if(uname!= null)
             {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
                String query = "SELECT *  FROM  admin  WHERE User_Name= ? and Password= ?";
                PreparedStatement psm = conn.prepareStatement(query);
                psm.setString(1, uname);
                psm.setString(2, psw);
                ResultSet rs = psm.executeQuery();
                if(rs.next())
                {
                    
                    response.sendRedirect("index1.jsp");
                }
                else
                {
                    response.sendRedirect("loginerror.jsp");
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

             
             }

//             if(uname!= null)
//             {
//            try {
//                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
//                String query ="SELECT  * FROM  admin  WHERE User_Name= ? and Password= ?";
//                PreparedStatement psm = conn.prepareStatement(query);
//                psm.setString(1, uname);
//                psm.setString(2, psw);
//                ResultSet rs = psm.executeQuery();
//                if(rs.next())
//                {
//                    
//                    response.sendRedirect("addroom.jsp");
//                }
//                else
//                {
//                    response.sendRedirect("loginerror.jsp");
//                }
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
//                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//             
//             }
//
//             if(uname!= null)
//             {
//            try {
//                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
//                String query ="SELECT  * FROM  admin  WHERE User_Name= ? and Password= ?";
//                PreparedStatement psm = conn.prepareStatement(query);
//                psm.setString(1, uname);
//                psm.setString(2, psw);
//                ResultSet rs = psm.executeQuery();
//                if(rs.next())
//                {
//                    
//                    response.sendRedirect("reservation.jsp");
//                }
//                else
//                {
//                    response.sendRedirect("loginerror.jsp");
//                }
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
//                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//             
//             }


            
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
