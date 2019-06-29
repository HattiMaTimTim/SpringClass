package com.redleaf.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach = context.getBean("swimCoach", Coach.class);
		System.out.println("Coach says: " + coach.getDailyWorkout());
		System.out.println("Coach fortune: " + coach.getDailyFortune());
		context.close();

	}

}
