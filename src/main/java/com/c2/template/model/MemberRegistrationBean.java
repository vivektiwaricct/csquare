package com.c2.template.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberRegistrationBean {
	@NotEmpty
	private String isTutor;
	@NotEmpty
	private String firstName;
	private String lastName;
	@NotEmpty
	private String gender;
	@NotEmpty @Email
	private String email;
	private String phone;
	@NotEmpty	
	private String password;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsTutor() {
		return isTutor;
	}

	public void setIsTutor(String isTutor) {
		this.isTutor = isTutor;
	}
	
	

}
