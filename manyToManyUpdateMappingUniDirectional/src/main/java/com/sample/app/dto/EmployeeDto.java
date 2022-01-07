package com.sample.app.dto;

import java.util.List;

public class EmployeeDto {
	private String firstName;
	private String lastName;
	
	private List<ProjectDto> projectDtos;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<ProjectDto> getProjectDtos() {
		return projectDtos;
	}

	public void setProjectDtos(List<ProjectDto> projectDtos) {
		this.projectDtos = projectDtos;
	}
	
}
