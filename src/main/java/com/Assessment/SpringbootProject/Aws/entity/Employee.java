package com.Assessment.SpringbootProject.Aws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Man")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
@Column(name="Id")
private Long id;

@Column(name="Name")
private String name;

@Column(name="Salary")
private Double salary;

@Column(name="Designation")
private String  designation;

public String getName() {
	return name;
}

public Long getId() {
	return id;
}
public Double getSalary() {
	return salary;
}
public String getDesignation() {
	return designation;
}
public void setName(String name) {
	this.name = name;
}
public void setId(Long id) {
	this.id = id;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
}
     