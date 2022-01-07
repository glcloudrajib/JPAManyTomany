package com.sample.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.app.dto.ProjectDto;
import com.sample.app.dto.ProjectDto;
import com.sample.app.entity.Employee;
import com.sample.app.entity.Project;
import com.sample.app.entity.Project;
import com.sample.app.service.ProjectService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService pjtService;

	@ApiOperation(value = "Save Project", notes = "Create new Project")
	@PostMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> saveProject(@RequestBody ProjectDto pjtDto) {

		Project persistedPjt = pjtService.saveProject(pjtDto);

		return new ResponseEntity<>(persistedPjt, HttpStatus.CREATED);
	}

	@ApiOperation(value = "Get Projects", notes = "Get All Projects")
	@GetMapping(value = "/projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> getProject(@PathVariable final Integer id) {

		return new ResponseEntity<>(pjtService.getById(id), HttpStatus.CREATED);
	}
	
	//Learned from CFT project
	@ApiOperation(value = "Get Project", notes = "Get employee by emp id")
	@GetMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Project>> getProjects(@RequestParam("empId") Integer id) {

		List<Project> persistedPjt = pjtService.findAllByEmployees_IdIn(id);

		return new ResponseEntity<>(persistedPjt, HttpStatus.CREATED);
	}

	
	@ApiOperation(value = "Update Project", notes = "Update Existing Project")
	@PutMapping(value = "/Projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> updateProject(@PathVariable("id") int id, 
			@RequestBody ProjectDto prjDto) {

		Project persistedEmp = pjtService.updateProject(id, prjDto);

		return new ResponseEntity<>(persistedEmp, HttpStatus.OK);
	}

}
