package com.otm.daoimpl;
/*
@Author Sankajit Roy
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.otm.config.HibernateUtil;
import com.otm.dao.UniversityDAO;
import com.otm.entity.Student;
import com.otm.entity.University;

//DAOimpl class implements DAO interface
public class UniversityDaoImpl implements UniversityDAO {

	// getting session connection 
	Session session = HibernateUtil.getSessionFactory().openSession();
	// starting transaction 
	Transaction t = session.beginTransaction();
	
	// method for adding data
	@SuppressWarnings("deprecation")
	@Override
	public void addStudent() {
		
		// creating object of University for invoking setter method
		University uni = new University();
		uni.setUname("MAKAUT");
		uni.setUhead("Ramesh Sen");
		uni.setUzone("South");
		
		// creating multiple object of Student for invoking setter method
		Student s1 = new Student();
		s1.setSname("Anit Roy");
		s1.setSdept("CSE");
		s1.setSaddress("Raiganj");
		s1.setSphone(78455562);
		s1.setSemail("anit@gmail.com");
		
		Student s2 = new Student();
		s2.setSname("Riya Paul");
		s2.setSdept("EE");
		s2.setSaddress("Malda");
		s2.setSphone(82504764);
		s2.setSemail("riya@gmail.com");
		
		Student s3 = new Student();
		s3.setSname("Raju Pandit");
		s3.setSdept("IT");
		s3.setSaddress("Kolkata");
		s3.setSphone(98327454);
		s3.setSemail("raju@gmail.com");
		
		// storing multiple object data by ArrayList
		ArrayList<Student> std = new ArrayList<>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		
		// save session data
		uni.setStudent(std);
		session.save(uni);
		// commit transaction
		t.commit();
		System.out.println("----------Inserted Successfully-----------");
		
	}

	// method for fetching data
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Override
	public void fetchStudent() {
		
		Query q = session.createQuery("From University");
		// list with University entity
		List<University> al = q.getResultList();
		// traversing 
		Iterator<University> itr = al.iterator();
		while(itr.hasNext()) {
		// fetching the data
		University u1 = itr.next();
		System.out.println("         -----------University Details-----------");
		System.out.println(u1.getUname()+" "+u1.getUhead()+" "+u1.getUzone());
		}
		System.out.println("----------------------------------------------------------");
		Query q1 = session.createQuery("From Student");
		// list with Student entity
		List<Student> al1 = q1.getResultList();
		// traversing 
		Iterator<Student> itr1 = al1.iterator();
		
		System.out.println("         -----------Student Details-----------");
		while(itr1.hasNext()) {
		// fetching the data
		Student s = itr1.next();
		System.out.println(s.getSname()+" "+s.getSdept()+" "+s.getSaddress()+" "+s.getSphone()+" "+s.getSemail());
		
		}
	}
	
}
