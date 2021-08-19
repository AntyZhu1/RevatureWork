package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginFailedServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
	
			out.print("<h1>Login Failed, please try again</h1>");
			out.print("<a href='login.html'>Return to Login</a>");
	
	
			
			out.close();
	}
}
