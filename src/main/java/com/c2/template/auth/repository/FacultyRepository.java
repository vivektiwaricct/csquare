package com.c2.template.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.c2.template.entities.Faculty;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Long> {

}
