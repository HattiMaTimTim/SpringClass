package com.redleaf.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("swimCoach", Coach.class);
		System.out.println("Coach says: " + coach.getDailyWorkout());
		System.out.println("Coach fortune: " + coach.getDailyFortune());
		context.close();

	}

}
