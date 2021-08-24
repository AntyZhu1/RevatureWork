package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteUserServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO userDao = UserDAOFactory.getUserDao();
		
		try {
			List<User> users = userDao.getUsers();
			if (username != null) {
				try {
					userDao.deleteUser(username, password);
					request.getRequestDispatcher("style.html").include(request, response);
					request.getRequestDispatcher("navbar.html").include(request, response);
					out.print("<h1>Deleted User: " + username + ".</h1>");
					request.getRequestDispatcher("profile.html").include(request, response);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					request.getRequestDispatcher("style.html").include(request, response);
					request.getRequestDispatcher("navbar.html").include(request, response);
					out.print("<h1>Error, something went wrong!</h1>");
					request.getRequestDispatcher("profile.html").include(request, response);
				}
			}
			
			else {
				request.getRequestDispatcher("style.html").include(request, response);
				request.getRequestDispatcher("navbar.html").include(request, response);
				out.print("<h1>Error, Username Can't be empty</h1>");
				
				request.getRequestDispatcher("profile.html").include(request, response);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
