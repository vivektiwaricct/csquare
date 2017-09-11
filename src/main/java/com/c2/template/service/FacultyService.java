package com.c2.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c2.template.auth.repository.FacultyRepository;
import com.c2.template.entities.Faculty;

@Service
public class FacultyService {
	@Autowired
	private FacultyRepository facultyRepository;

	public void registerFaculty(Faculty faculty) {
		facultyRepository.save(faculty);
	}
}
