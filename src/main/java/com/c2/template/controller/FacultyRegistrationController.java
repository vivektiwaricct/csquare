package com.c2.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c2.template.C2Constants;
import com.c2.template.controller.response.Response;
import com.c2.template.entities.Faculty;
import com.c2.template.service.FacultyService;

@RestController
public class FacultyRegistrationController {
	@Autowired
	private FacultyService facultyService;

	@RequestMapping("/registerFaculty")
	public ResponseEntity<Response> registerFaculty(Model model, Faculty faculty, BindingResult errors) {
		facultyService.registerFaculty(faculty);
		return new ResponseEntity<Response>(new Response(C2Constants.SUCCESS), HttpStatus.OK);
	}
}
