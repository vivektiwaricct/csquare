package com.c2.template.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.c2.template.entities.Gender;

@Entity
@Table
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long leadNo;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String city;
	private String subject;

	public long getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(long leadNo) {
		this.leadNo = leadNo;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
