package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call method on beans
		System.out.println(coach.getDailyWorkout());
		
		// call fortune method
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
