package com.anthony;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie cookies[] = request.getCookies();
		
		if (cookies != null) {
			String username = cookies[0].getValue();
			if (username != "" || username != null) {
				
				request.getRequestDispatcher("profile.html").include(request, response);

			}
			else {
				request.getRequestDispatcher("style.html").include(request, response);

				out.print("<h1>You have not logged in yet!</h1>");
			}
		}
		else {
			request.getRequestDispatcher("style.html").include(request, response);

			out.print("<h1>You have not logged in yet!</h1>");
		}
		out.close();

	}
}
