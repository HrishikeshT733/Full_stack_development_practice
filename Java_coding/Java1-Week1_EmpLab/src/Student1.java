import java.util.Arrays;

//extra example
public class Student1 {
private int id;
private String name;
private int[] marks;
private float avg;
private char grade;
//constructor
public Student1() {
	super();
}
public Student1(int id, String name, int[] marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
//getters and setters
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}



@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", avg=" + avg + ", grade="
			+ grade + "]";
}
//methods 
public void calculateAverage(int[] marks){
	int average=0;
	for(int i=0;i<marks.length;i++){
		average=average+marks[i];
	}
	average=average/marks.length;
	this.avg=average;
	
}
public void findGrade(){
	if(avg<=100 && avg>80){
		grade='O';
	}else if(avg<=80 && avg>70){
		grade='A';
	}else if(avg<=70 && avg>50){
		grade='B';
	}else if(avg<=50){
		grade='F';
	}
	this.grade=grade;
}

}
