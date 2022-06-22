package com.springTutorial.activityTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityTwoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("activityTwo.xml");

		MasterCoach coach = context.getBean("tennisCoach", MasterCoach.class);

		System.out.println(coach.dailyWorkOut());

		context.close();
	}

}
