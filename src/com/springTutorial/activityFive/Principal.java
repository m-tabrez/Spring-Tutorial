package com.springTutorial.activityFive;

import java.util.Random;

import com.sprintTutorial.annotationAutowired.Management;

public class Principal implements Management {

	private String[] rules = { "Wake up early", "Dress Properly", "Bath Cleanly", "Ear Breakfase" };

	Random r = new Random();

	@Override
	public String getNewRule() {
		// TODO Auto-generated method stub
		int random = r.nextInt(rules.length);
		return rules[random];
	}

}
