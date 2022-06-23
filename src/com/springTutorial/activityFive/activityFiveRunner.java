package com.springTutorial.activityFive;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class activityFiveRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(activityFiveConfig.class);

		MasterCoach tennis = context.getBean("coach", MasterCoach.class);

		System.out.println(tennis.getWorkout());

		System.out.println(tennis.getRules());

		context.close();

	}

}
