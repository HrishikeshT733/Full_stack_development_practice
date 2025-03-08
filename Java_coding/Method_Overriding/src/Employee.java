
public class Employee {
//General class
	//super,parent and base
	public String name;
	public int empId;
	public double salary;
	 
	//common Behaviour
	public void attendace(){
		System.out.println("General employee attendance");
	}
	public double calSal(int noOfDays){
		System.out.println("Calsal for employee");
		double HRA=0,HI=0,PF=0;
		return noOfDays*salary+HRA+HI+PF;
		
	}
	//constructor
	public Employee() {
		super();
	}
	public Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
