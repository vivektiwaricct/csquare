package com.c2.template.auth.service;

public interface SecurityService {
	String findLoggedInUsername();

	void autologin(String username, String password);
}
