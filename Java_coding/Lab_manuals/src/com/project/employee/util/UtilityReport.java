package com.project.employee.util;
import java.util.*;

public class UtilityReport {
public  static void showreport(ArrayList<Employee>er){
	HashMap hs=new HashMap();
	for(int i=0;i<er.size();i++){
		hs.put(er.get(i).Employee_Name, er.get(i).Basic_salary);
	}
	System.out.println(hs);
}
}
