package com.maven;
/*
@Author Sankhajit Roy
*/

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maven.daoimpl.EmployeeDaoImpl;
import com.maven.entity.Employee;

// main class
public class App {
	// main method
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) {
    	// created daoimpl class object
    	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
    	int a;
    	do {
    		// created a scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.println("------------ Enter Choice -----------");
			System.out.println("1. add \n2. read \n3. update \n4. delete \n5. exit");
			int ch = sc.nextInt();
			switch(ch) {
			// called addEmployee() method
			case 1: 
				empdao.addEmployee();
				break;
			// called fetchEmployee() method
			case 2: 
				empdao.fetchEmployee();
				break;
			// called updateEmployee() method	
			case 3: 
				empdao.updateEmployee();
				break;
			// called deleteEmployee() method
			case 4:
				empdao.deleteEmployee();
				break;
			// to exit from menu
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");
			}
			// want to continue or not
			System.out.println("Do you want to continue? Y/N");
			a = sc.next().charAt(0);
			
		// pass the condition to continue or not	
		} while (a == 'y' || a =='Y');
    	System.out.println("Thank You.");
    }
}
