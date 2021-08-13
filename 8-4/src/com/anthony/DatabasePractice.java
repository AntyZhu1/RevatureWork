package com.anthony;

import java.sql.*;


public class DatabasePractice {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("jdbc:mysql://localhost:3306/demo1");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "Videogames123");
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from customer");
		while (resultSet.next() ) {
			System.out.println("ID: " + resultSet.getInt(1) + ", Name: " + resultSet.getString(2) + ", Email: " + resultSet.getString(3) + ", Phone: " + resultSet.getString(4));
		}
	}
	
}
