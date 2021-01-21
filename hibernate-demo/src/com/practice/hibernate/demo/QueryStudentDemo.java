package com.practice.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			// query students
			List<Student> students = session.createQuery("from Student").getResultList();
			
			System.out.println(students + "\n\n");
			
			// query students last name sharma
			students = session.createQuery("from Student s where s.lastName='sharma'").getResultList();
			
			System.out.println(students + "\n\n");
			
			// query students last name sharma or first name parteek
			students = session.createQuery("from Student s where s.lastName='sharma' OR" + 
									" s.firstName='Parteek'").getResultList();
			
			System.out.println(students + "\n\n");
			

			// query students email ending with gmail.com
			students = session.createQuery("from Student s where s.email LIKE '%chitkara.com'").getResultList();
			
			System.out.println(students + "\n\n");
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
