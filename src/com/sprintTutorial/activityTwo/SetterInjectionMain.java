package com.sprintTutorial.activityTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextMethodsInitilaizing.xml");

		Coach cricketCoach = context.getBean("coach", Coach.class);

		System.out.println(cricketCoach.getFortune());

		System.out.println(cricketCoach.getName() + "- " + cricketCoach.getEmail() + " - " + cricketCoach.getGender());

		context.close();
	}

}
