package com.springTutorial.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee nishan = context.getBean("employee", Employee.class);

		System.out.println(nishan.getDetails());
	}

}
