import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	
	
	
	
}

public class TestComparable {
public static void main(String[] args) {
	
	ArrayList<Student>a1=new ArrayList<Student>();
	a1.add(new Student(101,"meena"));
	a1.add(new Student(102,"deepa"));
	a1.add(new Student(110,"samira"));
	a1.add(new Student(104,"diya"));
	a1.add(new Student(105,"aasha"));
	
	System.out.println("Stundent name before sorting:");
	for(Student s1:a1){
		System.out.println(s1);
	}
	Collections.sort(a1);
	
	System.out.println("*************After sorting a1 is: Data sorted by Name **********************");
	for(Student s1:a1){
		System.out.println(s1);
	}
}
}
