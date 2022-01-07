package com.sample.app.dto;

import java.util.List;

public class ProjectDto {

	private String projectName;

	private int teamSize;
	
	private List<EmployeeDto> employeeDtos;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public List<EmployeeDto> getEmployeeDtos() {
		return employeeDtos;
	}

	public void setEmployeeDtos(List<EmployeeDto> employeeDtos) {
		this.employeeDtos = employeeDtos;
	}
	
	

}
