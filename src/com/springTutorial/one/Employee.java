package com.springTutorial.one;

public class Employee implements ExtractDetails {

	private int empId;
	private String empName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return empId + " " + empName;
	}

}
