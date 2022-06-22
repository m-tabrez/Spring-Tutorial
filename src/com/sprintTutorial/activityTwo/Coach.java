package com.sprintTutorial.activityTwo;

import java.util.Random;
import java.util.Scanner;

public class Coach implements FortuneService {

	private String name;
	private String email;
	private String gender;

	private String[] fortServices = { "You have a good day", "Enjoy the dinner for today", "Get your gift package" };

	Random random = new Random();
	Scanner scan = new Scanner(System.in);

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

	public void runWhileLoop() {
		int choice = 0;

		do {
			System.out.println("You are under while loop & this has started by init method");
			System.out.println("Enter your choice greater than or equals to 4 to exit");
			choice = scan.nextInt();
		} while (choice < 4);
	}

	public void destroyMethod() {
		System.out.println("This is destroy method called on exit of this object");
		scan.close();
	}

}
