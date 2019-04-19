package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="Enter your first name")
	@Size.List({
	@Size(min=3, message="Name must be longer than 3 characters"),
	@Size(max=20, message="Name cannot exceed 20 characters")})
	private String firstName; 
	
	@NotBlank(message="Enter your last name")
	@Size(max=20, message="Name must be 20 characters or less")
	private String lastName;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")
	private String email; 
	
	@NotBlank(message="Email confirmation is required")
	private String confirmEmail;
	
	@NotBlank(message="Password is required")
	@Size(min = 8, message="Password not long enough, must be 8 characters or more")
	private String password; 
	
	@NotBlank(message="Confirmation password is required")
	private String confirmPassword; 
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	@NotNull(message="Please enter a valid, 8 digit date (MM/dd/YYYY)")
	private LocalDate birthday; 
	
	@NotNull(message="Enter number of tickets")
	@Min(value=1, message="You must purchase at least 1 ticket")
	@Max(value=20, message="Cannot reserve more than 20 tickets")
	private int numberOfTickets; 
	
	private boolean emailMatching; 
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(confirmEmail);
		} else {
			return false;
		}
	}
	
	private boolean passwordMatching; 
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		} else {
			return false;
		}
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

}
