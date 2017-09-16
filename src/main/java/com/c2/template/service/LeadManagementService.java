package com.c2.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c2.template.auth.repository.LeadRepository;
import com.c2.template.entities.Lead;

@Service
public class LeadManagementService {
	@Autowired
	LeadRepository leadRepository;

	public void saveLead(Lead lead) {
		leadRepository.save(lead);
	}
}
