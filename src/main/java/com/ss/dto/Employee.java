package com.ss.dto;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -1501465316082663937L;

	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
