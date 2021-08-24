package com.anthony;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ListUserServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("style.html").include(request, response);
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		UserDAO userDao = UserDAOFactory.getUserDao();
		
		out.print("<h1>User List</h1>");
		
		try {
			List<User> users = userDao.getUsers();
			out.println("<div class = 'menu'>");
			
			out.println("<table>");
			for (User temp : users) {
				
				out.println("<tr><td>ID: " + temp.getId() + " | Username: " + temp.getUsername() + " | Password: " + temp.getPassword() + " | Nationality: " + temp.getNationality() + "</td></tr>");
//				out.println("			<td><form method = \"post\" action = \"delete_user.html\"> <input type = \"submit\" value = \"Delete User\" id=\"btn\"></form></td>\r\n"
//						+ "			<td><form method = \"post\" action = \"update_user.html\"> <input type = \"submit\" value = \"Update User\" id=\"btn\"></form></td>");
				out.println("<br>");
				
			}
			
			out.println("</table>");
			out.println("</div>");
			request.getRequestDispatcher("edit_users.html").include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		out.close();
	}
}
