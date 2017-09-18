package com.c2.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c2.template.auth.repository.MemberRegistrationRepository;
import com.c2.template.entities.MemberRegistrationEntity;

@Service
public class MemberRegistrationService {
	@Autowired
	MemberRegistrationRepository memberRegistrationRepository;

	public void memberRegistration(MemberRegistrationEntity memberRegistrationEntity) {
		memberRegistrationRepository.save(memberRegistrationEntity);
	}
}
