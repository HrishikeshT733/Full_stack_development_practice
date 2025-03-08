
public class Employee {

	public static int empId=100;
	public String name;
	public double salary;
	//Constructor
	
	public Employee() {
		super();
		
	}
	
	public Employee(String name, double salary) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.empId=empId;
	}
	 //static method
	public static void generateEMPID(){
		empId++;
		System.out.println("Welcome to seed infotech...!");
	}
	public  void details(){
		System.out.println("Employee details: ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee salary: "+salary);
	}
	
	//static block
	static{
		System.out.println("Foundation date : "+"1994");
	}
	//Accessor and Mutator
	public static int getEmpId() {
		return empId;
	}
	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//object print details
	@Override
	public String toString() {
		return empId+"\nEmployee [ empId="+" name=" + name + ", salary=" + salary + "]";
	}
	
	
	 
	
	
	
	
}
