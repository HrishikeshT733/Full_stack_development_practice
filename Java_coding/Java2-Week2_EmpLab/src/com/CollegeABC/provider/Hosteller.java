package com.CollegeABC.provider;

public class Hosteller extends Student{
private String  hostelName;
private int roomNo;
//Constructors
public Hosteller() {
	super();
}
public Hosteller(int studId, String name, int deptId, String hostelName, int roomNo) {
	super(studId, name, deptId);
	this.hostelName = hostelName;
	this.roomNo = roomNo;
}
//Getter and setters
public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public int getRoomNo() {
	return roomNo;
}
public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

//methods 
public static Hosteller getHostellerDetails(){
	Hosteller h1=new Hosteller();
	h1.setStudId(101);
	h1.setName("Ram");
	h1.setDeptId(30001);
	h1.setHostelName("sant kabir");
	h1.setRoomNo(25);
	return h1;
}
@Override
public String toString() {
	return "Hosteller [hostelName=" + hostelName + ", roomNo=" + roomNo + ", studId=" + studId + ", name=" + name
			+ ", deptId=" + deptId + "]";
}




}
