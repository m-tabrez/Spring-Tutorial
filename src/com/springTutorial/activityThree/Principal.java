package com.springTutorial.activityThree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Principal implements Management {

	@Value("${vals.rules}")
	private String[] princiRules;

	@Override
	public String departmentRules() {
		// TODO Auto-generated method stub
		return princiRules[1];
	}


}
