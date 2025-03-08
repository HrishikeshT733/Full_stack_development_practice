package com.aage;

public class EligibilityException extends Exception{
	
	//data member
	public String msg;

	//constructor
	public EligibilityException(String msg) {
		super();
		this.msg = msg;
	}

	public EligibilityException() {
		super();
	}

	@Override
	public String toString() {
		return "EligibilityException [msg=" + msg + "]";
	}
	
	
}
