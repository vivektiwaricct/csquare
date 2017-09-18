package com.c2.template.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.c2.template.entities.MemberRegistrationEntity;

@Repository
public interface MemberRegistrationRepository extends CrudRepository<MemberRegistrationEntity, Long> {

}
