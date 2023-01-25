package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCriketCoach", CricketCoach.class);
		// call methods on bean
		// ...... let's come back to this..
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// call our new methods to get the literal values
		System.out.println("Email Address: " + theCoach.getEmailAddress());
		System.out.println("Team Name " + theCoach.getTeam());
		// close the context
		context.close();
	}

}
