package com.anthony;

import java.sql.*;
import java.util.List;

public interface UserDAO {
	
	public User checkUserLogin(String username, String password) throws SQLException;
	 
	public int createUser(String username, String password) throws SQLException;
	
	public int deleteUser(String username, String password) throws SQLException;
	
	public List<User> getUsers() throws SQLException;

}
