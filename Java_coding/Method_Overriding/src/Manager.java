
public class Manager extends Employee {


int noOfprrojects;


public Manager() {
	super();
}


public Manager(String name, int empId, double salary, int noOfprrojects) {
	super(name, empId, salary);
	this.noOfprrojects = noOfprrojects;
}


public int getNoOfprrojects() {
	return noOfprrojects;
}


public void setNoOfprrojects(int noOfprrojects) {
	this.noOfprrojects = noOfprrojects;
}

@Override
public void attendace(){
	System.out.println("Manager has attendance");
}
  
@Override
public double calSal(int noOfDays){
	
	return noOfDays*salary+50000;
}
public void dailyMeeting(){
	System.out.println("Manager daily meeting");
}

}
