package com.c2.template.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.c2.template.C2Constants;
import com.c2.template.auth.service.RequestContextKeeper;
import com.c2.template.entities.Faculty;
import com.c2.template.model.TutorEducationalDetailsModel;
import com.c2.template.service.FacultyService;

@Validated
@RestController
public class FacultyRegistrationController {
	@Autowired
	private FacultyService facultyService;

	@RequestMapping(value = "/registerFaculty", method = RequestMethod.POST)
	public ResponseEntity<Void> registerFaculty(Model model, @Valid Faculty faculty, BindingResult errors) {
		facultyService.registerFaculty(faculty);
		RequestContextKeeper.getContext().put(C2Constants.STATUS, C2Constants.SUCCESS);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/updateEducationalDetails", method = RequestMethod.POST)
	public ResponseEntity<Void> updateEducationalDetails(Model model,@Valid TutorEducationalDetailsModel tutorEducationalDetails,
			BindingResult errors) {
		RequestContextKeeper.getContext().put(C2Constants.STATUS, C2Constants.SUCCESS);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
