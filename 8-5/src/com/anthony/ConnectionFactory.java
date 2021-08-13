package com.anthony;

import java.sql.*;
import java.util.*;

public class ConnectionFactory {
	
	private static Connection con = null;
	
	private ConnectionFactory() {
		
	}
	
	public static Connection getConnection() throws SQLException {
		
		if (con == null) {
			
			ResourceBundle rb = ResourceBundle.getBundle("com/anthony/dbConfig");
			String url = rb.getString("url");
			String username = rb.getString("username");
			String password = rb.getString("password");
			
			con = DriverManager.getConnection(url, username, password);
			
		}
		return con;
		
	}
	

}
