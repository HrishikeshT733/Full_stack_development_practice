package com.project.employee.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;

public class EmployeeMain {
public static void main(String[] args) {
//	Employee er[]=new Employee[3];
//	er[0]=new Employee(101,"suresh",25000,1000,20000,25000,new Date(1,2,2023));
//	er[1]=new Employee(102,"Bharat",12000,2000,23000,32000,new Date(20,07,2018));
//	er[2]=new Employee(103,"Gopal",18000,3000,54000,67000,new Date(3,8,2009));
	ArrayList<Employee>er=new ArrayList<Employee>();
	er.add(new Employee(101,"suresh",25000,1000,20000,25000,new Date(1,2,2023)));
	er.add(new Employee(102,"Bharat",12000,2000,23000,32000,new Date(20,07,2018)));
	er.add(new Employee(103,"Gopal",18000,3000,54000,67000,new Date(3,8,2009)));
	UtilityList.printList(er);
    UtilityReport.showreport(er);
  //  SortUtil.comparebysalary(er.get(0), er.get(1));
  Collections.sort(er, new SortUtil()::comparebysalary);
  
// Iterator it=er.iterator();
// while(it.hasNext()){
//	 System.out.println(it.next());
// }
  System.out.println("After sorting employees according to salary");
  for(Employee e1:er){
	  System.out.println(e1.Employee_Name+"="+e1.Basic_salary);
  }
 // UtilityList.printList(er);
 // UtilityReport.showreport(er);
  Collections.sort(er, new SortUtil()::compare);
  System.out.println("After sorting employees according to Names");
  for(Employee e1:er){
	  System.out.println(e1.Employee_Name+"="+e1.Basic_salary);
  }
  try{
  SearchUtil.searchEmpInfo(104,er);
  }catch(EmployeeRecordNotFoundException e){
	  System.out.println(e);
  }

}
}
