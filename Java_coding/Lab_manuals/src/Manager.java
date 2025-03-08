
public class Manager extends Employee{
public double petrol_allowance;
public double food_allowance;
public double other_allowance;

//constructors
public Manager() {
	super();
}

public Manager(int employee_id, String employee_Name, double basic_salary, double medical, double net_Salary,
		double gross_salary, Date dd, double petrol_allowance, double food_allowance, double other_allowance) {
	super(employee_id, employee_Name, basic_salary, medical, net_Salary, gross_salary, dd);
	this.petrol_allowance = (basic_salary/100)*8;
	this.food_allowance = basic_salary*0.13;
	this.other_allowance = basic_salary*0.03;
}

//methods
@Override
public double calNetsal(){
	Net_Salary=Gross_salary-PT;
	return Net_Salary;
}
@Override
public double calGrosssal(){
	Gross_salary=Basic_salary+HRA+Medical+petrol_allowance+food_allowance+other_allowance;
	return Gross_salary;
}
@Override
public String toString() {
	return "Manager [petrol_allowance=" + petrol_allowance + ", food_allowance=" + food_allowance + ", other_allowance="
			+ other_allowance+",Gross Salary: "+Gross_salary+",Net Salary: "+Net_Salary+"]";
}

public static void main(String[] args) {
	Manager mg=new Manager(103, "ram", 10000, 1000, 0, 0, new Date(1,2,2011), 0, 0, 0);
	mg.calGrosssal();
	mg.calNetsal();
	System.out.println(mg);
	
}


}
