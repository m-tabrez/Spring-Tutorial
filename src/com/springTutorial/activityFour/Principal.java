package com.springTutorial.activityFour;

import org.springframework.stereotype.Component;

@Component
public class Principal implements Management {

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return "Come to classes with Formal dress";
	}

}
