package com.company.Day9.jdbc.CRUD;

public class EmployeeDaoFactory {

    private static EmployeeDao dao;

    private EmployeeDaoFactory(){

    }

    public static EmployeeDao getEmployeedao(){
        if (dao==null)
            dao=new EmployeeDaoImpl();
        return dao;
    }

}
