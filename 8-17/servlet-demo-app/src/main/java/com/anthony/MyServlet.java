package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class MyServlet implements Servlet{

	ServletConfig config = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		System.out.println("Servlet is initialized");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Called...");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello From Servlet </h1>");
		out.print("</body></html>");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is Destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		String message = "Servlet Created by Admin";
		return message;
	}


}
