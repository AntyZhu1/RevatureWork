package com.anthony;

public class UserDAOFactory {
	
	private static UserDAO dao;
	
    private UserDAOFactory() {
    }

    public static UserDAO getUserDao() {
        if (dao == null) {
            dao = new UserDAOImpl();
        }
        return dao;
    }
}
