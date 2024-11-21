package com.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.PhoneNo;
import com.hibernate.entity.User;

public class Test_OneToMany {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		PhoneNo p1 = new PhoneNo(101, "7058578557", "personal");
		PhoneNo p2 = new PhoneNo(102, "1234567890", "personal");
		PhoneNo p3 = new PhoneNo(103, "0123-21231", "office");
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		Set<PhoneNo> phoneNos = new HashSet<PhoneNo>();
		phoneNos.add(p1);
		phoneNos.add(p2);
		phoneNos.add(p3);
		
		User u1 = new User(1, "Tanmay", phoneNos);
		
		s.save(u1);
		
		t.commit();
		s.close();
		f.close();
		
	}

}