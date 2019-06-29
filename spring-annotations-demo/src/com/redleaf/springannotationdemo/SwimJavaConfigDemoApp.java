package com.redleaf.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println("Coach says: " + coach.getDailyWorkout());
		System.out.println("Coach fortune: " + coach.getDailyFortune());
		System.out.println("team: " + coach.getTeam() + ": email: "+ coach.getEmail());
		context.close();

	}

}
