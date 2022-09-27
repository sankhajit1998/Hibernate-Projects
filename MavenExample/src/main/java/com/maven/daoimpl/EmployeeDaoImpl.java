package com.maven.daoimpl;
/*
@Author Sankhajit Roy
 */
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.maven.config.HibernateUtil;
import com.maven.dao.EmployeeDao;
import com.maven.entity.Employee;

// daoimpl class implements dao interface
public class EmployeeDaoImpl implements EmployeeDao {

	// getting session connection 
	Session session = HibernateUtil.getSessionFactory().openSession();
	//starting transaction 
	Transaction t = session.beginTransaction();
	Scanner sc = new Scanner(System.in);

	// method for adding data
	@Override
	public void addEmployee() {
		String n, a, e;
		long p;
		double s;
		System.out.println("Enter name: ");
		n = sc.next();
		System.out.println("Enter email id: ");
		e = sc.next();
		System.out.println("Enter phone number: ");
		p = sc.nextLong();
		System.out.println("Enter address: ");
		a = sc.next();
		System.out.println("Enter salary: ");
		s = sc.nextDouble();

		// creating object of employee for invoking setter method
		Employee emp = new Employee();
		emp.setEname(n);
		emp.setEphone(p);
		emp.setEmail(e);
		emp.setAddr(a);
		emp.setEsalary(s);

		System.out.println("Inserted successfully.");

	}

	// method for fetching data
	@Override
	public void fetchEmployee() {

		System.out.println("Enter id: ");
		int i = sc.nextInt();

		// fetching data
		Employee emp1 = session.get(Employee.class, i);
		System.out.println(emp1.getEname()+" "+emp1.getEphone()+" "+emp1.getEmail()+" "+emp1.getAddr()+" "+emp1.getEsalary());

	}

	// method for updating data
	@SuppressWarnings("deprecation")
	@Override
	public void updateEmployee() {
		// taking id to update that column
		System.out.println("Enter id: ");
		int i = sc.nextInt();
		Employee emp2 = session.get(Employee.class, i);
		System.out.println("Enter changed salary: ");
		double ss = sc.nextDouble();
		emp2.setEsalary(ss);
		session.update(emp2);
		System.out.println("Updated successfully.");
		t.commit();
	}

	// method for deleting data
	@SuppressWarnings("deprecation")
	@Override
	public void deleteEmployee() {
		// taking id to delete that column
		System.out.println("Enter id: ");
		int i = sc.nextInt();
		Employee emp3 = session.get(Employee.class, i);
		session.delete(emp3);
		System.out.println("Deleted successfully.");
		t.commit();
	}


}
