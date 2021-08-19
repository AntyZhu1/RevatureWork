package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.print("welcome " + name);
		
		//invisible textfield
		out.println("<form action='wervlet2>");
		out.println("<input type='hidden' name='uname' value='" + name + "'");
		out.println("<input type='submit' value='send'");
		out.println("</form>");
		out.close();
		
	}
}
