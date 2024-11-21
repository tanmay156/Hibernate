package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;


public class Test1 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Pranav");
		s1.setPercent(78.62f);
		session.persist(s1);

		Student s2 = new Student(2, "chandan", 99.99f);
		session.save(s2);
		
		tr.commit();
		session.close();
		fact.close();


	}

}
