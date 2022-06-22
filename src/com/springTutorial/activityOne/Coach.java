package com.springTutorial.activityOne;

import java.util.Random;

public class Coach implements FortuneService {

	private String name;
	private String email;
	private String gender;

	private String[] fortServices = { "You have a good day", "Enjoy the dinner for today", "Get your gift package" };

	Random random = new Random();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Coach(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub

		int randIndex = random.nextInt(fortServices.length);

		return fortServices[randIndex];
	}

}
