
public abstract class Person {
 String name;
 public abstract void displayDetails();
 //Constructors
public Person() {
	super();
}

public Person(String name) {
	super();
	this.name = name;
}
 
//methods
public static void show(Person p){
	if(p instanceof Doctor){
		Doctor dr=new Doctor();
		dr.name=p.name;
		dr.salary=((Doctor) p).salary;
		dr.SpecializationType=((Doctor) p).SpecializationType;//typecasting
		
		
		dr.displayDetails();
	}else if(p instanceof Nurse){
		Nurse nu=new Nurse();
		nu.name=p.name;
		nu.hrRate=((Nurse) p).hrRate;//typecasting
		nu.hrsWorked=((Nurse) p).hrsWorked;//typecasting
		nu.shift=((Nurse) p).shift;//typecasting
		nu.displayDetails();
	}

}
}
