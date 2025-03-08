
public class SeedInfotech {
public static void main(String[] args) {
	
	Employee yash=new Employee("Yash",60000);
	Employee.generateEMPID();
    yash.details();
    System.out.println();
	Employee esha=new Employee("Esha",40000);
	Employee.generateEMPID();
    esha.details();
    System.out.println();
	Employee snehal=new Employee("Snehal",30000);
	Employee.generateEMPID();
    snehal.details();
}
}
