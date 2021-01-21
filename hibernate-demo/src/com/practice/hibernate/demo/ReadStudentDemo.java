package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			Student student = new Student("Parteek", "Adlakha", "parteek@gmail.com");
			
			// save student
			session.beginTransaction();
			
			session.save(student);
			
			session.getTransaction().commit();
			
			System.out.println("Saved student, Generated id: " + student.getId());
			
			// retrieve student
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			Student parteek = session.get(Student.class, student.getId());
			
			if(parteek != null) System.out.println("Retrieved Student : " + parteek);
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
