package com.practice.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.practice.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// the function name becomes the bean id or the bean name
	// or the component name
	// so following the default naming scheme
	// the name of the function should've been tennisCoach
	@Bean 
	public Coach sillyCoach() {
		return new SwimCoach(new SadFortuneService());
	}
}
