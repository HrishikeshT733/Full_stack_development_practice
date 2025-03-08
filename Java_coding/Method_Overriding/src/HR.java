
public class HR extends Employee{
  public int incentive;

  
  
public HR() {
	super();
}

public HR(String name, int empId, double salary, int incentive) {
	super(name, empId, salary);
	this.incentive = incentive;
}

public int getIncentive() {
	return incentive;
}

public void setIncentive(int incentive) {
	this.incentive = incentive;
}


@Override
public void attendace(){
	System.out.println("HR has attendance");
}
  
@Override
public double calSal(int noOfDays){
	
	return noOfDays*salary+incentive;
}

public void fun(){
	System.out.println("HR Fun activities on friday");
}
}
