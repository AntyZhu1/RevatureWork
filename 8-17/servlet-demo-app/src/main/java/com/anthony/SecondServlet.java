package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Called...");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello From Second</h1>");
		out.print("</body></html>");
		
	}

}
