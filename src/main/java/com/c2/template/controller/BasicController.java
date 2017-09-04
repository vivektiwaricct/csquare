package com.c2.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c2.template.model.User;

@RestController
@RequestMapping("/web")
public class BasicController {
	/*@RequestMapping("/user")
	public User showUser(@RequestParam(name = "id", defaultValue = "1") long id,
			@RequestParam(name = "name", defaultValue = "Me") String name) {
		return new User(id, name);
	}*/
}
