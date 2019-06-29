package com.redleaf.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("Inside autowired setter");
//	}

	public YogaCoach() {
		System.out.println("Inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Perform 10 Pranayam";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
