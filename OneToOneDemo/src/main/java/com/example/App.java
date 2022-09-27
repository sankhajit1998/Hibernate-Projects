package com.example;
/*
@Author Sankhajit Roy
*/
import com.example.daoimpl.CitizenDAOImpl;

// main class
public class App 
{
	// main method
    public static void main( String[] args )
    {
    	// created class object
        CitizenDAOImpl cdao = new CitizenDAOImpl();
        // called methods
        cdao.addCitizen();
        cdao.fetchCitizen();
    }
}
