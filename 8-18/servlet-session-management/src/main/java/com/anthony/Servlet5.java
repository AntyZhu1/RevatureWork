package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet5 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("name");
			out.print("welcome " + name);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("uname",  name);
			
			out.println("<h1><a href = 'Servlet6" + name + "'>Click Here </a></h1>");
			
	
			
		}

}
