package com.example;

import com.example.daoimpl.DepartmentDaoImpl;

// main class
public class App 
{
    public static void main( String[] args )
    {
        DepartmentDaoImpl dimpl = new DepartmentDaoImpl();
        dimpl.addDepartment();
    }
}
