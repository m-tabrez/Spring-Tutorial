package com.springTutorial.activityThree;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityThreeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("activityThree.xml");

		Coach cricket = context.getBean("coach", Coach.class);

		System.out.println(cricket.dailyActivity());

		System.out.println(cricket.getRules());

		context.close();

	}

}
