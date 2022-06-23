package com.sprintTutorial.annotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coach implements MasterCoach {

	private Management managementRule;

	@Autowired
	public Coach(Management managementRule) {
		super();
		this.managementRule = managementRule;
	}

	@Override
	public String getDailyTask() {
		// TODO Auto-generated method stub
		return "Run on the Track for 30 minutes";
	}

	@Override
	public String getNewRules() {
		// TODO Auto-generated method stub
		return this.managementRule.getNewRule();
	}

}
