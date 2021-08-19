package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("style.html").include(request, response);
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		HttpSession session = request.getSession(false);
		if (session != null) {
			String name = (String)session.getAttribute("username");
			
			out.print("<h1>Hello " + name + "!</h1>");
			
		}
		else {
			out.print("<h1>You're Not Logged In! </h1>");
			request.getRequestDispatcher("login.html");
		}
		out.close();
	}

}
