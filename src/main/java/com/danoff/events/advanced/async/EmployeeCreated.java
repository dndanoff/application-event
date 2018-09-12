package com.danoff.events.advanced.async;

public class EmployeeCreated{

	private final Long employeeId;
	
	public EmployeeCreated(Long employeeId){
		this.employeeId=employeeId;
	}

	public Long getEmployeeId(){
	  return employeeId;
	}
}
