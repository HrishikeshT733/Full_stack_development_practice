package com.project.employee.util;
import java.util.*;

public class SortUtil implements Comparator<Employee>{
@Override
public  int compare(Employee e1, Employee e2) {
    return e1.Employee_Name.compareTo(e2.Employee_Name);
}
public int comparebysalary(Employee e1,Employee e2){
	if(e1.Basic_salary>e2.Basic_salary){
		return 1;
	}else if(e1.Basic_salary<e2.Basic_salary){
	return -1;
	}else{
		return 0;
	}
}
}
