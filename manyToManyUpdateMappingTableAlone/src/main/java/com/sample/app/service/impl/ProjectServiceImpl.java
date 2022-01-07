package com.sample.app.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.app.dto.EmployeeDto;
import com.sample.app.dto.ProjectDto;
import com.sample.app.entity.Employee;
import com.sample.app.entity.Project;
import com.sample.app.repository.EmployeeRepository;
import com.sample.app.repository.ProjectRepository;
import com.sample.app.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository pjtRepo;
	
	@Autowired
	private EmployeeRepository empRepo;

	
	@Override
	public Project getById(int id) {
		return pjtRepo.findById(id).get();
	}
	
	
	@Override
	@Transactional
	public Project saveProject(ProjectDto prjDto) {

		String prjName = prjDto.getProjectName();

		int teamSize = prjDto.getTeamSize();
		
		Project tempPjt = new Project();
		tempPjt.setProjectName(prjName);
		tempPjt.setTeamSize(teamSize);

		

		List<Employee> empsProxies = new ArrayList<>();

		for (EmployeeDto dto : prjDto.getEmployeeDtos()) {
			Employee emp = new Employee();
			emp.setFirstName(dto.getFirstName());
			emp.setLastName(dto.getLastName());
			empsProxies.add(emp);
		}

		tempPjt.setEmp(new HashSet<>(empsProxies));

		return pjtRepo.save(tempPjt);
	}
	
	@Override
	@Transactional
	public Project updateProject(int id,ProjectDto prjDto) {

		String prjName = prjDto.getProjectName();

		int teamSize = prjDto.getTeamSize();
		
		Project tempPjt = new Project();
		tempPjt.setProjectName(prjName);
		tempPjt.setTeamSize(teamSize);
		tempPjt.setProjectId(id);

		

		List<Employee> empsProxies = new ArrayList<>();

		for (EmployeeDto dto : prjDto.getEmployeeDtos()) {
			Employee emp = new Employee();
			emp.setFirstName(dto.getFirstName());
			emp.setLastName(dto.getLastName());
			empsProxies.add(emp);
		}

		tempPjt.setEmp(new HashSet<>(empsProxies));

		return pjtRepo.save(tempPjt);
	}


	@Override
	public List<Project> findAllByEmployees_IdIn(Integer id) {
		// TODO Auto-generated method stub
		return pjtRepo.findAllByEmp_IdIn(id);
	}



}
