package com.project.employee.util;


import java.util.Set;

//lab-exercise 2-problem statement 3
public class Employee {

	
public static int EmpIDCounter=100;//generating employeed id ////part of lab manual -lab_exercise-6
public int empId;
public String Employee_Name;
public double Basic_salary;
public double HRA;
public double Medical;
public double PF;
public double PT;
public double Net_Salary;
public double Gross_salary;
public static int countEmp=0;
public Date DOJ;//containment
public Set skillsets;
//constructors
public Employee() {
	super();
	countEmp++;
	
}

public Employee( int employee_id,String employee_Name, double basic_salary, double medical, double net_Salary,
		double gross_salary,Date dd) {
	super();
    this.empId=employee_id;
	this.Employee_Name = employee_Name;
	this.Basic_salary = basic_salary;
	this.Medical = medical;
	this.Net_Salary = net_Salary;
	this.Gross_salary = gross_salary;
	this.DOJ=dd;
	this.HRA=this.Basic_salary/2;
	this.PF=(this.Basic_salary/100)*12;
	this.PT=200;
	countEmp++;
	

}
//methods
public double calGrosssal(){
	Gross_salary=Basic_salary+HRA+Medical;
	return Gross_salary;
}
public double calNetsal(){
	Net_Salary=Gross_salary-(PF+PT);
	return Net_Salary;
}
public static void totalEmployees(){//part of lab manual -lab_exercise-6
	System.out.println("Total no of employees is : "+countEmp);
}
public static int generateEmpId(){//generating employeed id ////part of lab manual -lab_exercise-6
	EmpIDCounter++;
	return EmpIDCounter;
	
}


@Override
public String toString() {
	return "Employee [\nempId=" + empId + ",\nEmployee_Name=" + Employee_Name + ",\nBasic_salary=" + Basic_salary + ",\nHRA="
			+ HRA + ", \nMedical=" + Medical + ", \nPF=" + PF + ", \nPT=" + PT + ", \nNet_Salary=" + Net_Salary
			+ ", \nGross_salary=" + Gross_salary + ", \nDate of joining=" + DOJ + "\n]";
}

//main method
 public static void main(String[] args) {
	Employee e=new Employee();
	 e.empId=Employee.generateEmpId();
	e.Basic_salary=30000;
	e.Employee_Name="harish";

 
   
    e.Medical=2000;
   
    
    Employee e1=new Employee(0,"Prasad", 10000, 1000,0,0,new Date(1,2,2003));
    e1.empId=Employee.generateEmpId();
 
    //calculating gross salary and net salary
    e1.calGrosssal();
    e.calGrosssal();
    e1.calNetsal();
    e.calNetsal();
    Employee e2=new Employee(0,"Smitesh", 60000, 3000,0,0,new Date(4,6,2006));
    e2.empId=Employee.generateEmpId();
    System.out.println("Gross salary of both employees are \ne: "+e.Gross_salary+"\ne1: "+e1.Gross_salary);
	System.out.println("Net salary for both employees are \ne: "+e.Net_Salary+"\ne1: "+e1.Net_Salary);
	System.out.println();
	totalEmployees();//part of lab manual -lab_exercise-6
	System.out.println("EmpId of e: "+e.empId+"\nEmpId of e1: "+e1.empId);//part of lab manual -lab_exercise-6
	System.out.println("Details of e2: "+e2);//lab-manual --lab exercise-7
}


}
