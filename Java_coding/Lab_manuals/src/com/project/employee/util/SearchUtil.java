package com.project.employee.util;

import java.util.ArrayList;

public class SearchUtil{
public  static void searchEmpInfo(int e,ArrayList<Employee>er) throws EmployeeRecordNotFoundException{
  int k=0;
	for(int i=0;i<er.size();i++){
	if(e==er.get(i).empId){
	  System.out.println("Employee details found with Employee name as :"+er.get(i).Employee_Name);
	  k=0;
	  break;
  }	 
	else{
		k=1;
	}
}
	if(k==1){
	 throw new EmployeeRecordNotFoundException("Employee details not found");
	}	
}
}
