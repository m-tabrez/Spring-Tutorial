package com.springTutorial.activityFour;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Coach implements MasterCoach {

	@Autowired
	@Qualifier("admissionOfficer")
	private Management rules;

	@Autowired
	private User admin, guest;

	@PostConstruct
	public void warmUpBeforeStart() {
		System.out.println("Method running on post construct");
		admin = new User("Tabrez", "tabrez@gmail.com");
		guest = new User("guest", "no-email-required");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Method preDestroy");
		System.out.println(admin.getName() + " - " + admin.getEmail());
		System.out.println(guest.getName() + " - " + guest.getEmail());
	}

	@Override
	public String getActivity() {
		// TODO Auto-generated method stub
		return "Warm up - 10 minutes and Running - 15 minutes";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return rules.getRules();
	}

}
