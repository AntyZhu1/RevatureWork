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

		
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			
			session.invalidate();
			request.getRequestDispatcher("navbar.html").include(request, response);
			out.print("<h1>You have logged out</h1>");
		}
		else {
			request.getRequestDispatcher("login.html").include(request, response);
			out.print("<h1>You aren't logged in.</h1>");
			

		}

		
		out.close();
	}
	
}
