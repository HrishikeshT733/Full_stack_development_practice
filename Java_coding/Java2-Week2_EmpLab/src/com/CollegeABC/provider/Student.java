package com.CollegeABC.provider;

public class Student {
protected int studId;
protected String name;
protected int deptId;
//Constructors
public Student() {
	super();
}

public Student(int studId, String name, int deptId) {
	super();
	this.studId = studId;
	this.name = name;
	this.deptId = deptId;
}
//Getters and setters

public int getStudId() {
	return studId;
}

public void setStudId(int studId) {
	this.studId = studId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}


}
