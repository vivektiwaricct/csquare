package com.c2.template.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.c2.template.entities.Faculty;

@Component
public class FacultyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Faculty.class);
	}

	@Override
	public void validate(Object obj, Errors error) {
		
	}

}
