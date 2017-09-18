package com.c2.template.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.c2.template.entities.Lead;
import com.c2.template.entities.Syllabus;
import com.c2.template.model.LeadModel;
import com.c2.template.service.LeadManagementService;

@Validated
@RestController
public class LeadGenerationController {
	@Autowired
	LeadManagementService leadManagementService;

	@RequestMapping(value = "/registerLead", method = RequestMethod.POST)
	public ResponseEntity<Void> registerLead(Model model, @Valid LeadModel leadModel, BindingResult errors) {
		Lead lead = new Lead();
		BeanUtils.copyProperties(leadModel, lead);
		leadManagementService.saveLead(lead);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
