package com.springTutorial.activityFive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class activityFiveConfig {

	@Bean
	public Principal principal() {
		return new Principal();
	}

	@Bean
	public Coach coach() {
		return new Coach(principal());
	}

}
