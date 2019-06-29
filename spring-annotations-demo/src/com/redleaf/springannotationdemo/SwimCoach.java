package com.redleaf.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach() {
		System.out.println("In SwimCoach default constructor");
	}
	
	public SwimCoach(FortuneService fs) {
		fortuneService = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice swim with air tubes with team ";
	}

	@Override
	public String getDailyFortune() {
		//return "Comment me out!";
		return fortuneService.getFortune();
	}

}
