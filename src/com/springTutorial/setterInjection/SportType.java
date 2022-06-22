package com.springTutorial.setterInjection;

public class SportType {
	private String type;
	private String isAthlete;

	public SportType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportType(String type, String isAthlete) {
		super();
		this.type = type;
		this.isAthlete = isAthlete;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsAthlete() {
		return isAthlete;
	}

	public void setIsAthlete(String isAthlete) {
		this.isAthlete = isAthlete;
	}



}
