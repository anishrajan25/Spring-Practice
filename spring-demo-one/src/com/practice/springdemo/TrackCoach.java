package com.practice.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It! " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside init function: doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside destroy function: doMyCleanupStuff");
	}
}
