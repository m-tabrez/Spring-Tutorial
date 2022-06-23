package com.springTutorial.activityFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.annotation.PostConstruct;

public class Coach implements MasterCoach {

	private Principal coachRules;


	public Coach(Principal coachRules) {
		super();
		this.coachRules = coachRules;
	}

	@PostConstruct
	public void readTextfile() {
		File myFile = new File("C:\\Users\\Tabrez_m\\eclipse-workspace\\Spring-Tutorial\\src\\myFile.txt");

		try {
			Scanner scan = new Scanner(myFile);

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Do what ever you like";
	}

	@Override
	public String getRules() {
		// TODO Auto-generated method stub
		return coachRules.getNewRule();
	}

}
