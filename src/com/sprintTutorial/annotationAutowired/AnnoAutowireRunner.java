package com.sprintTutorial.annotationAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoAutowireRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotAutowired.xml");

		MasterCoach trackCoach = context.getBean("coach", MasterCoach.class);

		System.out.println(trackCoach.getDailyTask());

		System.out.println(trackCoach.getNewRules());

		context.close();

	}

}
