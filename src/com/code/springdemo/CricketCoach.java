package com.code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricketcoach: inside setter method of emaiAddress.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricketcoach: inside setter method of team.");
		this.team = team;
	}

	// create a no-args constructor
	public CricketCoach() {
		System.out.println("Cricketcoach: inside no-args");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketcoach: inside setter method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach luck day.";
	}

}
