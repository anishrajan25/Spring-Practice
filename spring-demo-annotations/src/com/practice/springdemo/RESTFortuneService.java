package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "There it is, your RESTFortune";
	}

}
