package com.zieta1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        Cookie[] name = request.getCookies();
//        String name=request.getParameter("username");  
//        String field=request.getParameter("technology");
        HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("name");  
//		String technology = request.getParameter("technology");
		out.println("Hi " + name);
//		out.println("Hi " + name + "You Take " + field);
	}

}
