package com.otm;

import com.otm.daoimpl.UniversityDaoImpl;

// main class
public class App 
{
	// main method
    public static void main( String[] args )
    {
    	// created a daoimpl class object
        UniversityDaoImpl dao = new UniversityDaoImpl();
        // called methods
//        dao.addStudent();
        dao.fetchStudent();
    }
}
