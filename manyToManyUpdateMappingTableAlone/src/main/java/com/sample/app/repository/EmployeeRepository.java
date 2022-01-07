package com.sample.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// Learned from CFT project(how to search by using other entity column(here in
	// Employee repository(Employee entity) we are searching by other entity (Project)
	// column projectId in many to many relationship)(for field Set<Project> projects = new HashSet<Project>() in Employee.java)
	List<Employee> findAllByProjects_ProjectIdIn(Integer id);

}