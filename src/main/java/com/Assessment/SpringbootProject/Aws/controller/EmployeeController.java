package com.Assessment.SpringbootProject.Aws.controller;

import java.util.Collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Assessment.SpringbootProject.Aws.Exception.EmployeeAlreadyExistsInDataBaseException;
import com.Assessment.SpringbootProject.Aws.entity.Employee;
import com.Assessment.SpringbootProject.Aws.service.ComparatorSort;
import com.Assessment.SpringbootProject.Aws.service.EmployeeService;


import lombok.SneakyThrows;
@RequestMapping("/api/employee1")
public class EmployeeController {

	@Autowired private EmployeeService employeeService;
	 @SneakyThrows
	 @PostMapping("/create1")
	 public Employee saveEmployee (
	 @RequestBody Employee employee) throws Exception
	 {
	 List<Employee> employeelist = employeeService.fetchEmployeeList();
	 for (Employee x : employeelist) {
	 if(employee.getId() == x.getId()) {
	 throw new
	EmployeeAlreadyExistsInDataBaseException("This id already exists in the database use a different id!");
	 }
	 }
	 return employeeService.saveEmployee(employee);
	 }

	 @GetMapping("/all1")
	 public List<Employee> fetchEmployeeList()
	 {
	 List<Employee> employeelist = employeeService.fetchEmployeeList();
	 Collections.sort(employeelist,new ComparatorSort());
	 return employeelist;
	 }

	 @PutMapping("/modify1")
	 public Employee
	 updateEmployee
	 (@RequestBody Employee employee,
	 @PathVariable("id") Long Id)
	 {
	 return employeeService.updateEmployee(
	 employee, Id);
	 }



	 @DeleteMapping("/remove1/{id}")
	 public String deleteEmployeeById(@PathVariable("id")
	 Long Id)
	 {
	 employeeService.deleteEmployeeById(
	 Id);
	 return "Deleted Successfully";
	 }
	}

