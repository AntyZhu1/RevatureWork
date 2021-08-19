package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		Cookie c = new Cookie ("username", "");
		c.setMaxAge(0);
		response.addCookie(c);
		
		out.print("<h1>You have successfully logged out!</h1>");
		out.print("<a href='login.html'>Return to Login</a>");
		
	}

}
