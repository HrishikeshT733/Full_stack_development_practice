package com.project.employee.util;

public class EmployeeRecordNotFoundException extends Exception{
	public String msg;

	public EmployeeRecordNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public EmployeeRecordNotFoundException() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeRecordNotFoundException [msg=" + msg + "]";
	}
	

}
