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

import com.c2.template.C2Constants;
import com.c2.template.auth.service.RequestContextKeeper;
import com.c2.template.entities.MemberRegistrationEntity;
import com.c2.template.model.MemberRegistrationBean;
import com.c2.template.model.TutorEducationalDetails;
import com.c2.template.service.MemberRegistrationService;

@Validated
@RestController
public class MemberRegistrationController {
	@Autowired
	MemberRegistrationService memberRegistrationService;

	@RequestMapping(value = "/registerMember", method = RequestMethod.POST)
	public ResponseEntity<Void> registerMember(Model model, @Valid MemberRegistrationBean memberBean,
			BindingResult errors) {
		MemberRegistrationEntity memberEntity = new MemberRegistrationEntity();
		BeanUtils.copyProperties(memberBean, memberEntity);
		memberRegistrationService.memberRegistration(memberEntity);

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
