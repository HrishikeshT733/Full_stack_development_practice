//example 1
public class Student {
private String studentId;
private String studentName;
private String studentAddress;
private  static String collegeName="ABC Technical institute";


///constructors
public Student() {
	super();
}

public Student(String studentId, String studentName, String studentAddress, String collegeName) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.collegeName = collegeName;
}


public Student(String studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}



//Getters and Setters
public String getStudentId() {
	return studentId;
	}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


 @Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			 + collegeName+"]";
}



}
