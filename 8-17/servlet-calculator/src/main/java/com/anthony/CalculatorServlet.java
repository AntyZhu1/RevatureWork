package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet{
	
//	public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
//		System.out.println("Servlet Get Method");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.print("<h1>Get Method Called</h1>");
//		out.print(new Date().toString());
//	}
//	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to Register Servlet</h1>");
		
		String number1 = request.getParameter("number_1");
		String number2 = request.getParameter("number_2");
		String function = request.getParameter("user_function");

		
	}
	
//	public double add(double a, double b) {
//		
//		
//		return a + b;
//		
//	}
//	
//	public double subtract(double a, double b) {
//		
//		
//		return a - b;
//		
//	}
//	
//	public double multiply(double a, double b) {
//		
//		
//		return a * b;
//		
//	}
//	
//	public double divide(double a, double b) {
//		
//		
//		return a / b;
//		
//	}
}
