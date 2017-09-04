package com.c2.template.auth.service;

import com.c2.template.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
