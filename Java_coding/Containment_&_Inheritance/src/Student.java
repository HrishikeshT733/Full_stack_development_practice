 
public class Student {
 int rollNo;
 String name;
 float marks;
 Address resadd;
 MyDate dd;
 //Student has a address
 public Student(int rollNo, String name, float marks, Address resadd, MyDate dd) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.resadd = resadd;
		this.dd = dd;
	}
 


public Student() {
	super();
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public Address getResadd() {
	return resadd;
}
public void setResadd(Address resadd) {
	this.resadd = resadd;
}
public MyDate getDd() {
	return dd;
}
public void setDd(MyDate dd) {
	this.dd = dd;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ",\nresadd=" + resadd + ", \ndd=" + dd
			+ "]";
}


}
