package com.zieta1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServletDatabase extends HttpServlet {
  
    
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
      
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        try {
        	System.out.println("before connection");
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("after connection");
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login","root","Hunt@1508");
            
            // Prepare SQL statement to retrieve user data
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM logindetails WHERE username=? AND password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            
            // Execute the query and retrieve results
            ResultSet rs = ps.executeQuery();
            
            // Check if the user data exists in the table
            if(rs.next()) {
                // User is authenticated, display success message
                out.println("<h2>Login successful!</h2>");
                out.println("<p>Welcome, " + rs.getString("username") + ".</p>");
            } else {
                // User is not authenticated, display error message
                out.println("<h2>Login failed!</h2>");
                out.println("<p>Invalid username or password.</p>");
            }
        } catch(Exception ex) {
            // Handle any errors that may occur
            out.println("<h2>Error!</h2>");
            out.println("<p>" + ex.getMessage() + "</p>");
            out.println(ex);
        } finally {
            // Close the output stream
            out.close();
        }
    }
}



