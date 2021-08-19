package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("style.html").include(request, response);
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		out.print("<h1>You have logged out</h1>");
		
		out.close();
	}
	
}
