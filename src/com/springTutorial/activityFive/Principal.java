package com.springTutorial.activityFive;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;

import com.sprintTutorial.annotationAutowired.Management;

public class Principal implements Management {

	@Value("${vals.rules}")
	private String[] rules;

	Random r = new Random();

	@Override
	public String getNewRule() {
		// TODO Auto-generated method stub
		int random = r.nextInt(rules.length);
		return rules[random];
	}

}
