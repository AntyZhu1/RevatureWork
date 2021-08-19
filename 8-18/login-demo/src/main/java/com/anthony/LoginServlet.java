package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.isEmpty() | password.isEmpty()) {
			response.sendRedirect("loginfailed");
		}
		
		else if (username.equals("john") ) {
			if (!password.equals("doe")) {
				response.sendRedirect("loginfailed");
			}
			else {
				out.print("<h1>You have logged in and may now access the profile</h1>");
				out.print("<a href='login.html'>Return to Login</a>");
				Cookie c = new Cookie("username",username);
				response.addCookie(c);
			}
		}
		

		
		out.close();
	}
}
