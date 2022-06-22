package com.springTutorial.activityFour;

import org.springframework.stereotype.Component;

@Component
public class AdmissionOfficer implements Management {

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return "Admission for all passed students only";
	}

}
