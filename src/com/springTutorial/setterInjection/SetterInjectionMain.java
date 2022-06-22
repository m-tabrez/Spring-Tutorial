package com.springTutorial.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Sport cricket = context.getBean("cricket", Sport.class);

		System.out.println(
				cricket.getSportId() + " - " + cricket.getSportName() + " - " + cricket.getType().getIsAthlete());

		context.close();

	}

}
