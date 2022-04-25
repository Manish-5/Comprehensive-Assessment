package com.Assessment.SpringbootProject.Aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Assessment.SpringbootProject.Aws.entity.Employee;

@Repository

public interface EmployeeRepository 
extends JpaRepository<Employee, Long>{

}
