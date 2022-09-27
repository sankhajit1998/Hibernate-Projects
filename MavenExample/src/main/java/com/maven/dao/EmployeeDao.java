package com.maven.dao;
/*
@Author Sankhajit Roy
 */

// dao inteface
public interface EmployeeDao {

	// save new employee details
	public void addEmployee();

	// fetch existing employee details
	public void fetchEmployee();

	// changing existing employee details
	public void updateEmployee();

	// remove existing employee details
	public void deleteEmployee();

}
