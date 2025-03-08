
public class Nurse extends Person{
public int hrsWorked;
public String shift;
public double hrRate;
@Override
public void displayDetails() {
	System.out.println("Nurse name: "+name+"\n hours worked"+hrsWorked+"\n Shift: "+shift+"\n Rate"+hrRate);
	
}

//constructors
public Nurse() {
	super();
}


public Nurse(String name, int hrsWorked, String shift, double hrRate) {
	super(name);
	this.hrsWorked = hrsWorked;
	this.shift = shift;
	this.hrRate = hrRate;
}


}
