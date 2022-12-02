package com.otm.config;
/*
@Author Sankajit Roy
*/
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//util class
public class HibernateUtil {

	// sessionfactory object
	private static SessionFactory sessionFactory;

	// configure with session factory
	static {
		try {
			sessionFactory= new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	// return sessionfactory method
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
