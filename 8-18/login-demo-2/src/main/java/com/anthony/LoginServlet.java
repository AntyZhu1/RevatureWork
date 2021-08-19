package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("john")) {
			if (password.equals("doe")) {
				out.print("<h1>You have logged in as: " + username + "!</h1>");
				request.getRequestDispatcher("index.html").include(request, response);
				Cookie c = new Cookie("username",username);
				response.addCookie(c);
			}
			else {
				request.getRequestDispatcher("style.html").include(request, response);

				out.print("<h1>Error, Invalid Password </h1>");
				request.getRequestDispatcher("login.html").include(request, response);
			}
		}
		else {
			request.getRequestDispatcher("style.html").include(request, response);

			out.print("<h1>Error, Invalid Username </h1>");
			request.getRequestDispatcher("/login.html").include(request, response);

		}
		
		out.close();
		
	}

}
