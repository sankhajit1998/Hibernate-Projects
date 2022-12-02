package com.example.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.dao.DepartmentDao;
import com.example.entity.Department;
import com.example.entity.Employees;

public class DepartmentDaoImpl implements DepartmentDao {

	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	
	@SuppressWarnings("deprecation")
	@Override
	public void addDepartment() {
		Department dept = new Department();
		dept.setDname("IT");
		dept.setDhead("Vikash");
		dept.setDzone("North");
		
		Employees emp = new Employees();
		emp.setEfname("Rajib");
		emp.setElname("Paul");
		emp.setEaddress("Kolkata");
		emp.setEmail("rajib@gmail.com");
		emp.setEphone(78501515);
		emp.setSalary(25000.50);
		
		Employees emp1 = new Employees();
		emp1.setEfname("Pranay");
		emp1.setElname("Sen");
		emp1.setEaddress("Assam");
		emp1.setEmail("pranay@gmail.com");
		emp1.setEphone(97545460);
		emp1.setSalary(35000.50);
		
		Employees emp2 = new Employees();
		emp2.setEfname("Arun");
		emp2.setElname("Verma");
		emp2.setEaddress("Mumbai");
		emp2.setEmail("arun@gmail.com");
		emp2.setEphone(62507041);
		emp2.setSalary(29500.50);
		
		ArrayList<Employees> al = new ArrayList<Employees>();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);
		
		dept.setEmployees(al);
		session.save(dept);
		t.commit();
		System.out.println("----------Inserted Successfully-----------");
		
	}

	@Override
	public void fetchDepartment() {
		// TODO Auto-generated method stub
		
	}

}
