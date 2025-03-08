import java.util.Set;

public class EmployeeCollection {
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
	public Set skillset;
	
	
	public EmployeeCollection() {
		super();
		countEmp++;
	}


	public EmployeeCollection(int empId, String employee_Name, double basic_salary, double hRA, double medical,
			double pF, double pT, double net_Salary, double gross_salary, Date dOJ, Set skillset) {
		super();
		this.empId = empId;
		Employee_Name = employee_Name;
		Basic_salary = basic_salary;
		HRA = hRA;
		Medical = medical;
		PF = pF;
		PT = pT;
		Net_Salary = net_Salary;
		Gross_salary = gross_salary;
		DOJ = dOJ;
		this.skillset = skillset;
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
}
