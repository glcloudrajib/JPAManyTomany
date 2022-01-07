package com.sample.app.service;

import java.util.List;

import com.sample.app.dto.EmployeeDto;
import com.sample.app.entity.Employee;

public interface EmployeeService {

		Employee save(EmployeeDto emp);
		
		Employee getById(int id);

		Employee update(int id, EmployeeDto empDto);

		List<Employee> findAllByProjects_IdIn(Integer id);
		
}
