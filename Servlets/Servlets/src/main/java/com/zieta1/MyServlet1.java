package com.zieta1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IN SERVLET");
		response.setContentType("text/plain");
//		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("In MyServlet1 : before");
//		RequestDispatcher rd=request.getRequestDispatcher("MyServlet2");
//		rd.forward(request, response);
//		rd.include(request, response);
		out.println("In MyServlet1 : after");
	}

}
