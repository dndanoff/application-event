package com.danoff.events.advanced.chained;

public class EmployeeCreated{

	private final Long employeeId;
	
	public EmployeeCreated(Long employeeId){
		this.employeeId=employeeId;
	}

	public Long getEmployeeId(){
	  return employeeId;
	}
}
