package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			// retrieve student
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			Student shrey = session.get(Student.class, 3);
			
			if(shrey != null) {
				System.out.println("Retrieved Student : " + shrey);
				session.delete(shrey);
			}
			
			session.getTransaction().commit();
			
			//second delete
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.createQuery("delete from Student where firstName = 'vaibhav'").executeUpdate();
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
