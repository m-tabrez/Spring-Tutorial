package com.springTutorial.setterInjection;

public class Sport {
	private int sportId;
	private String sportName;
	private SportType type;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(int sportId, String sportName, SportType type) {
		super();
		this.sportId = sportId;
		this.sportName = sportName;
		this.type = type;
	}

	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public SportType getType() {
		return type;
	}

	public void setType(SportType type) {
		this.type = type;
	}

}
