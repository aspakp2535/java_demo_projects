package com.zieta1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.equals("admin") && password.equals("password123")) {
			response.getWriter().println("You login Successfully");
		} else {
			response.setContentType("text/plain");

			response.getWriter().println("Invalid username or password. Please try again.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("/login");
			rd.include(request, response);
			
//			response.sendRedirect("login.html");;
		}
		
		
	}

}
