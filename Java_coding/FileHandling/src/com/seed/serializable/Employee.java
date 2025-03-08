package com.seed.serializable;

import java.io.Serializable;
//Serializable interface is marker interface
public class Employee implements Serializable
{
	String name;
	transient int empno;
	transient int sal;//transient is used to hide data and its value is not reflected in file
  public Employee(){  
  }
	public Employee(String enm,int no,int sal)
    {
		this.name=enm;		
		this.empno=no;
        this.sal=sal;
    }
	public void display()
    {
		System.out.println("Employee name is " + name);
		System.out.println("Employee ID is " + empno);
		System.out.println("Employee salary is " + sal);
    } 
}	