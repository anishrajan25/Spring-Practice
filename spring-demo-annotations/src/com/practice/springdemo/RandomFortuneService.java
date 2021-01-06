package com.practice.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"There it is, your RandomFortuneService",
			"It's your RandomFortuneService",
			"Here you have your RandomFortuneService"
	};
	
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(data.length);
		
		return data[index];
	}

}
