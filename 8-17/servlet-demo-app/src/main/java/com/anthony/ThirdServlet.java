package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
		System.out.println("Servlet Get Method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Get Method Called</h1>");
		out.print(new Date().toString());
	}
	
}
