package com.sprintTutorial.annotationAutowired;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Management {

	@Override
	public String getNewRule() {
		// TODO Auto-generated method stub
		return "Sports practice will not exceed more than 2 hours";
	}

}
