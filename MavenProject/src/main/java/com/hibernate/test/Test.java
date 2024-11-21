package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;


public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Employee e = new Employee(1, "Tanmay", 50000.54f);
		
		int id = (int) session.save(e);
		
		tr.commit();
		session.close();
		factory.close(); 
	}

}
