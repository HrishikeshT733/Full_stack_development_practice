package com.seed.externalizable;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee1 implements Externalizable {

	private int empId;
	private String name;
    public	transient  double basicSalary;	//why transient is not working during deserialization?

	public Employee1() {
		empId = 100;
		name = "Abhay";
		basicSalary = 5000.00;
	}
	public Employee1(int empId, String name,
			double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public void display(){
		System.out.println("EmpId: " + empId +
				"\tName: " + name + "\tBasic Salary: "
				+ basicSalary);
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + 
				", name=" + name + ", basicSalary="
			+ basicSalary + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) 
			throws IOException {
		out.writeInt(empId);
		out.writeObject(name);
		out.writeDouble(basicSalary);
	}
	@Override
	public void readExternal(ObjectInput in)
			throws IOException,
			ClassNotFoundException {
		empId = in.readInt();
		name = (String) in.readObject();
		basicSalary = in.readDouble();
	}
}
