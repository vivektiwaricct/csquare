package com.c2.template.entities;

public enum Gender {
	MALE("Male"), FEMALE("Female");
	String value;

	Gender(String value) {
		this.value = value;
	}

	public String getGender() {
		return this.value;
	}
}
