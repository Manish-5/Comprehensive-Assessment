package com.Assessment.SpringbootProject.Aws.service;

import java.util.List;

import com.Assessment.SpringbootProject.Aws.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	 List<Employee> fetchEmployeeList();
	Employee updateEmployee(Employee emplopyee,
	 Long Id);
	void deleteEmployeeById(Long Id);

}
