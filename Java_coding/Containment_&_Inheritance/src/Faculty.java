
public class Faculty {
  
  int empId;
  String name;
  float salary;
   Address resadd;
   MyDate Doj;



public Faculty() {
	super();
}
public Faculty(int empId, String name, float salary, Address resadd, MyDate doj) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.resadd = resadd;
	Doj = doj;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getResadd() {
	return resadd;
}
public void setResadd(Address resadd) {
	this.resadd = resadd;
}
public MyDate getDoj() {
	return Doj;
}
public void setDoj(MyDate doj) {
	Doj = doj;
}
@Override
public String toString() {
	return "Faculty [salary=" + salary + ", empId=" + empId + ", name=" + name + ", \nresadd=" + resadd + ", \nDoj=" + Doj
			+ "]";
}
   
   
}
