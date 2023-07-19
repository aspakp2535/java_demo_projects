package com.zieta1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
//		Cookie c = new Cookie("username1", username);
//		response.addCookie(c);
		out.println("Welcome " + username);
//		out.println("<html><body><form action=\"WelcomeServlet\" method=\"post\"><label for=\"technology\">Technology:</label><input type=\"text\" id=\"technology\" name=\"technology\" required><input type=\"<a href='WelcomeServlet?username=\"+username+\"'>Go To Next</a>\" id=\"Submit\"></form></body></html>");
//		out.print("<a href='WelcomeServlet?username="+username+"'>Go To Next</a>"); 
//		out.println("<html><body><form action='WelcomeServlet' method='post'><input type='hidden' name='username' value='" +username+"'><label for='technology'>Technology:</label><input type='text' id='technology' name='technology' required><input type='submit' id='Submit'></form></body></html>");
		 HttpSession session=request.getSession();  
	        session.setAttribute("name",username);  
	  
	        out.print("<a href='WelcomeServlet'>visit</a>");  
	}

}
