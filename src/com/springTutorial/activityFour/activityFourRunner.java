package com.springTutorial.activityFour;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class activityFourRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("activityFour.xml");

		MasterCoach coach = context.getBean("coach", MasterCoach.class);

		System.out.println(coach.getActivity());

		System.out.println(coach.getRules());

		context.close();

	}

}
