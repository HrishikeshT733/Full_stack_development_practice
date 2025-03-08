
public class Tester extends Employee{

	public Tester(){
		super();
	}
	public Tester(String name, int empId, double salary) {
		super(name, empId, salary);
		
	}
	@Override
	public void attendace(){
		super.attendace();
		System.out.println("Tester has attendance");
	}
	  
	@Override
	public double calSal(int noOfDays){
		
		return noOfDays*salary;
	}
}
