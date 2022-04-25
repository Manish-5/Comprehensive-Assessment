package com.Assessment.SpringbootProject.Aws.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assessment.SpringbootProject.Aws.entity.Employee;
import com.Assessment.SpringbootProject.Aws.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl 
         implements EmployeeService{
	
	@Autowired
	 private EmployeeRepository employeeRepository;


	 @Override
	 public Employee saveEmployee(Employee employee)
	 {
	 return employeeRepository.save(employee);
	 }

	 @Override public List<Employee> fetchEmployeeList()
	 {
	 return (List<Employee>)
	 employeeRepository.findAll();
	 }

	 @Override
	 public Employee
	 updateEmployee(Employee employee,
	 Long Id)
	 {
	 Employee empDB
	 = employeeRepository.findById(Id)
	 .get();
	 if (Objects.nonNull(employee.getName())
	 && !"".equalsIgnoreCase(
	 employee.getName())) {
	 empDB.setName(
	 employee.getName());
	 }
	 if (Objects.nonNull(
	 employee.getSalary())) {
	 empDB.setSalary(
	 employee.getSalary());
	 }
	 if (Objects.nonNull(employee.getDesignation())
	 && !"".equalsIgnoreCase(
	 employee.getDesignation())) {
	 empDB.setDesignation(
	 employee.getDesignation());
	 }
	 return employeeRepository.save(empDB);
	 }

	@Override
	public void deleteEmployeeById(Long Id) {
	employeeRepository.deleteById(Id);
	}
	}

