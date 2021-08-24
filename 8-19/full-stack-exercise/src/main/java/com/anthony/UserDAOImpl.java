package com.anthony;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
	
    private static Statement statement = null;
    Connection con = null;
    
    public UserDAOImpl() {
        try {

            this.con = ConnectionFactory.getConnection();

        } catch (SQLException throwables) {

            throwables.printStackTrace();

        }
    }
    
	@Override
	public User checkUserLogin(String username, String password) throws SQLException {
		String request = "SELECT * FROM users WHERE username = ? AND password = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setString(1, username);
		ps.setString(2, password);

		ResultSet result = ps.executeQuery();
		
		
		User user = null;
		
		if (result.next()) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
		}
		
		con.close();
		
		return user;		
	}
	
	@Override
	public int createUser(String username, String password, String nationality) throws SQLException {
		
		String request = "INSERT INTO users (username, password, nationality) Values (?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, nationality);

		int i = ps.executeUpdate();
		
		return i;
		
	}
	
	@Override
	public int deleteUser(String username, String password) throws SQLException {
		String request = "DELETE FROM users WHERE username = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setString(1, username);
		

		int i = ps.executeUpdate();
		
		return i;
		
	}

	@Override
	public List<User> getUsers() throws SQLException {
		List<User> users = new ArrayList<>();
		
		String request = "SELECT * FROM users";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ResultSet out = ps.executeQuery();
		
		while (out.next()) {
			User temp = new User(out.getInt(1), out.getString(2), out.getString(3), out.getString(4));
			users.add(temp);
		}
		
		return users;
	}

	@Override
	public int updateUser(String username, String password, String nationality, String updater) throws SQLException {
		String request = "UPDATE users SET username = ?, password = ?, nationality = ? WHERE username = ?";
		
		PreparedStatement ps = con.prepareStatement(request);
		
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, nationality);

		ps.setString(4, updater);
		
		int i = ps.executeUpdate();
		
		return i;
				
	}



}
