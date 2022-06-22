package com.springTutorial.setterInjection;

public class TraditionalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sport cricket = new Sport(201, "cricket", new SportType("indoor", "false"));

		System.out
				.println(cricket.getSportId() + " - " + cricket.getSportName() + " - "
						+ cricket.getType().getIsAthlete()
						+ " - " + cricket.getType().getType());
	}

}
