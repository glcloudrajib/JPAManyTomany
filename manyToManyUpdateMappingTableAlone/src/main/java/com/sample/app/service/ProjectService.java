package com.sample.app.service;

import java.util.List;

import com.sample.app.dto.ProjectDto;
import com.sample.app.entity.Employee;
import com.sample.app.entity.Project;

public interface ProjectService {
	
	Project saveProject(ProjectDto pjtDto);
	
	Project updateProject(int id, ProjectDto pjtDto);
	
	Project getById(int id);

	List<Project> findAllByEmployees_IdIn(Integer id);
	
}
