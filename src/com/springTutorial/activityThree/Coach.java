package com.springTutorial.activityThree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Coach implements MasterCoach {

	@Autowired
	@Qualifier("principal")
	private Management rules;

	@Override
	public String dailyActivity() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 20 minutes";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return rules.departmentRules();
	}


}
