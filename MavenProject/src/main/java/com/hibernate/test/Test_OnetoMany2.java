package com.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Department;
import com.hibernate.entity.Employee2;


public class Test_OnetoMany2 {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Employee2 e1 = new Employee2(101, "Pranav", "Developer", 20000.21);
		Employee2 e2 = new Employee2(102, "Tanmay", "Tester", 30000.21);
		Employee2 e3 = new Employee2(104, "Chandan", "HR", 200000.21);
		Employee2 e4 = new Employee2(105, "Ritesh", "Manager", 100000.21);
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		
		Set<Employee2> Employee2 = new HashSet<Employee2>();
		Employee2.add(e1);
		Employee2.add(e2);
		Employee2.add(e3);
		Employee2.add(e4);
		
		Department A = new Department(1, "IT", Employee2);
		
		s.save(A);
		
		t.commit();
		s.close();
		f.close();

	}
}