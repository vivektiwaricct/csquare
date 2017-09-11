package com.c2.template.auth.service;

import com.c2.template.entities.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
