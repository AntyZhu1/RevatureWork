package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO userDao = UserDAOFactory.getEmployeeDao();
		
		try {
			List<User> users = userDao.getUsers();
			
			for (User temp: users) {
				if (temp.getUsername().equals(username) && temp.getPassword().equals(password)) {
					out.print("<h1>You have logged in as: " + username + "!</h1>");
					request.getRequestDispatcher("index.html").include(request, response);
			        HttpSession session=request.getSession();  
					session.setAttribute("username", username);
					response.sendRedirect("profile");
				}
				else if (temp.getUsername().equals(username) && !temp.getPassword().equals(password)) {
					
					request.getRequestDispatcher("login.html").include(request, response);
					out.print("<h1>Error, Invalid Password </h1>");
					
					
				}
				else if (!temp.getUsername().equals(username) && temp.getPassword().equals(password)) {
					request.getRequestDispatcher("login.html").include(request, response);
					out.print("<h1>Error, Invalid Username </h1>");
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if (username.equals("john")) {
//			if (password.equals("doe")) {
//				out.print("<h1>You have logged in as: " + username + "!</h1>");
//				request.getRequestDispatcher("index.html").include(request, response);
//		        HttpSession session=request.getSession();  
//				session.setAttribute("username", username);
//			}
//			else {
//				request.getRequestDispatcher("style.html").include(request, response);
//
//				out.print("<h1>Error, Invalid Password </h1>");
//				request.getRequestDispatcher("login.html").include(request, response);
//			}
//		}
//		else {
//			request.getRequestDispatcher("style.html").include(request, response);
//
//			out.print("<h1>Error, Invalid Username </h1>");
//			request.getRequestDispatcher("/login.html").include(request, response);
//
//		}
		
		out.close();
		
	}

}
