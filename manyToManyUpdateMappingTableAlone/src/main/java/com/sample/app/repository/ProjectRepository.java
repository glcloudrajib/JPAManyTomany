package com.sample.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.app.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>  {

	
	// Learned from CFT project(how to search by using other entity column(here in
	// Project repository(Project entity) we are searching by other entity (Employee)
	// column Id in many to many relationship)(for field private Set<Employee> emp = new HashSet<Employee>()in project.java)
	List<Project> findAllByEmp_IdIn(Integer id);
	

}
