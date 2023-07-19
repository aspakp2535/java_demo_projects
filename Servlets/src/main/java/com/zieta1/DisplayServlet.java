package com.zieta1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");

    Cookie[] cookies = request.getCookies();
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Cookies</title></head>");
    out.println("<body>");

    if (cookies != null) {
      out.println("<h2> Cookies Present in the Client-Side </h2>");
      for (int i = 0; i < cookies.length; i++) {
        out.println("<p>" + cookies[i].getName() + " : " + cookies[i].getValue() + "</p>");
      }
    } else {
      out.println("<h2>No cookies present at the client-side</h2>");
    }
    out.println("</body></html>");
  }
}
