package com.c2.template.entities;

public enum DocumentType {
	PASSPORT("Passport"), ADHAR("Adhar"), PAN("PAN");
	String type;

	DocumentType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
