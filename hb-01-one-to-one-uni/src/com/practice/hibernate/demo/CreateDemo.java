package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Instructor;
import com.practice.hibernate.demo.entity.InstructorDetail;
import com.practice.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			Instructor inst = new Instructor("Nikhil", "Mentor", "nikhil@cq.com");
			
			InstructorDetail instDet = new InstructorDetail("WEB", "teach");
			
			inst.setInstructorDetail(instDet);
			
			session.beginTransaction();

			session.save(inst);
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}

}
