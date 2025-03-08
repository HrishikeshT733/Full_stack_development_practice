
public class Doctor  extends Person{
public double salary;
public String SpecializationType;


	@Override
	public void displayDetails() {
		System.out.println("Doctor name :"+name+"\nSalary is "+salary+" \nSpecialization is "+SpecializationType);
		
	}

	 //Constructors
	public Doctor() {
		super();
	}

	public Doctor(String name, double salary, String specializationType) {
		super(name);
		this.salary = salary;
		this.SpecializationType = specializationType;
	}
	
}
	
	


