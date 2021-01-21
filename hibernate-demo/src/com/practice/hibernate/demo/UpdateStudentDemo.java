package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		try {
			Session session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			int sId = 1;
			
			System.out.println("Update student with id: " + sId);
			
			Student anni = session.get(Student.class, sId);
			
			anni.setFirstName("Annirudh");
			
			session.getTransaction().commit();
			
			// second update query
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.createQuery("update Student set email = 'temp@chitkara.com'").executeUpdate();

			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
