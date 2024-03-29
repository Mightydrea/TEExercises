package com.techelevator.validation.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")
	private String email;
	
	@NotBlank(message="Password is required")
	@Size(min = 8, message="Password must be 8 characters or more")
	private String password;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
