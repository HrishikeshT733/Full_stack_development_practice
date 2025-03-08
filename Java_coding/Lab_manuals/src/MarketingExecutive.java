
public class MarketingExecutive extends Employee{
public int km;
public double tour_allowance; //Rs 5 per km travelled
public double telephone_allowance;

//constructors
public MarketingExecutive() {
	super();
}


public MarketingExecutive(int employee_id, String employee_Name, double basic_salary, double medical, double net_Salary,
		double gross_salary, Date dd, int km) {
	super(employee_id, employee_Name, basic_salary, medical, net_Salary, gross_salary, dd);
	this.km = km;
	this.tour_allowance = this.km*5;
	this.telephone_allowance = 1500;
}

//methods
@Override
public double calNetsal(){
	Net_Salary=Gross_salary-PT;
	return Net_Salary;
}
@Override
public double calGrosssal(){
	Gross_salary=Basic_salary+HRA+Medical+tour_allowance+telephone_allowance;
	return Gross_salary;
}





@Override
public String toString() {
	return "MarketingExecutive [km=" + km + ", tour_allowance=" + tour_allowance + ", telephone_allowance="
			+ telephone_allowance + ", Employee_Name=" + Employee_Name + ", Basic_salary=" + Basic_salary + ", HRA="
			+ HRA + ", Medical=" + Medical + ", Net_Salary=" + Net_Salary + ", Gross_salary=" + Gross_salary + "]";
}


public static void main(String[] args) {
	MarketingExecutive me=new MarketingExecutive(104, "raghav", 10000, 1000, 0, 0, new Date(1,2,2008), 200);
	me.calGrosssal();
	me.calNetsal();
	System.out.println(me);
}
}
