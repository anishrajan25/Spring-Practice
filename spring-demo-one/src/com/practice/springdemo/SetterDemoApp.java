package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on beans
		System.out.println("Workout: " + coach.getDailyWorkout());

		System.out.println("Fortune: " + coach.getDailyFortune());
		
		System.out.println("E-mail: " + coach.getEmailAddress());
		
		System.out.println("Team: " + coach.getTeam());
		
		// close the context
		context.close();

	}

}
