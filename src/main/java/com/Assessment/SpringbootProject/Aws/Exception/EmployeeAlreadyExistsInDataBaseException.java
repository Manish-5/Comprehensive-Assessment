package com.Assessment.SpringbootProject.Aws.Exception;

public class EmployeeAlreadyExistsInDataBaseException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public EmployeeAlreadyExistsInDataBaseException() {
	 System.out.println("The id already exists in the database");
	 }
	 public EmployeeAlreadyExistsInDataBaseException(String s) {
	 super(s);
	 }
}
	



