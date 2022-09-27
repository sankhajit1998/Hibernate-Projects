package com.example.daoimpl;
/*
@Author Sankhajit Roy
*/

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.config.HibernateUtil;
import com.example.dao.CitizenDAO;
import com.example.entity.Address;
import com.example.entity.Citizen;

// DAOimpl class implements DAO interface
public class CitizenDAOImpl implements CitizenDAO {

	// getting session connection 
	Session session = HibernateUtil.getSessionFactory().openSession();
	//starting transaction 
	Transaction t = session.beginTransaction();
	
	// method for adding data
	@SuppressWarnings("deprecation")
	@Override
	public void addCitizen() {
		
		// creating object of citizen for invoking setter method
		Citizen c = new Citizen();
		c.setCname("Sankhajit");
		c.setSurname("Roy");
		c.setPhone(78456582);
		c.setEmail("sankha@gmail.com");
		c.setDob("2002-09-26");
		
		// creating object of address for invoking setter method
		Address a = new Address();
		a.setIdnumber(12345);
		a.setIdtype("addhar");
		a.setAddress("Cooch Behar");
		a.setCity("COB");
		a.setState("West Bengal");
		a.setPin(736156);
		
		a.setCitizen(c);
		c.setAddress(a);   // link address object to citizen object
		
		// save session data
		session.save(c);
		// commit transaction
		t.commit();
		System.out.println("----------Inserted Successfully-----------");
	}

	// method for fetching data
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public void fetchCitizen() {
		
		Query q = session.createQuery("From Citizen");
		// list with citizen entity
		List<Citizen> al = q.getResultList();
		// traversing 
		Iterator<Citizen> itr = al.iterator();
		while(itr.hasNext()) {
		// fetching the data
		Citizen c1 = itr.next();
		Address a1 = c1.getAddress();
		System.out.println(c1.getCname()+" "+c1.getSurname()+" "+c1.getAddress());
		System.out.println(a1.getIdnumber()+" "+a1.getIdtype()+" "+a1.getCity());
		
		}
		
	}

}
