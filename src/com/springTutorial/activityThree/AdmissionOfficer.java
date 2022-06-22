package com.springTutorial.activityThree;

import org.springframework.stereotype.Component;

@Component
public class AdmissionOfficer implements Management {

	@Override
	public String departmentRules() {
		// TODO Auto-generated method stub
		return "No admission for aspirants with lesser CGPA";
	}

}
