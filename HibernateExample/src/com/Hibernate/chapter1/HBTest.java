package com.Hibernate.chapter1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBTest {

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.setEmpId(1);
		emp.setEmpName("kamal");

		SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		
		Session session= sessionfac.openSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		
	}

}
