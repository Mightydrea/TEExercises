package com.techelevator;

public class Employee {

	// private declarations

	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;

	// constructor

	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}

	// methods

	public void raiseSalary(double percent) {

		annualSalary = annualSalary + ((percent * annualSalary) / 100);
	}
	
	public String getFullName() {

		fullName = lastName + ", " + firstName;

		return fullName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}