package com.sample.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "projects")
public class Project {
	@Id
	@GeneratedValue
	@Column(name = "pjt_id")
	private int projectId;

	private String projectName;

	private int teamSize;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project_mapping", joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "pjt_id"), inverseJoinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "emp_id"))
	@JsonBackReference
	private Set<Employee> emp = new HashSet<Employee>();

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

}