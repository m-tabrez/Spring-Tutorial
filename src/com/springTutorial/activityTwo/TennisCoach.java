package com.springTutorial.activityTwo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements MasterCoach {

	@Override
	public String dailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice 30 minutes for Backhand volley";
	}

}
