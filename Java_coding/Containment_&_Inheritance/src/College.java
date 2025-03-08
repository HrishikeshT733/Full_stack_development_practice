
public class College {
 public static void main(String[] args) {
	Student s1,s2,s3;
	Faculty f1;
	//method 1
	s1=new Student();
	s1.setRollNo(1);
	s1.setName("Ram");
	s1.setMarks(78.8f);
	s1.setResadd(new Address("pune","mh","ind",31202));//containment achieved here
	s1.setDd(new MyDate(3,2,2001));
	//method 2
	s2=new Student(2,"Radha",98.5f,new Address("pune","mh","ind",31202),new MyDate(8,4,2002));//containment achieved here
	//method 3
	s3=new Student();
	s3.rollNo=3;
	s3.name="Priya";
	s3.marks=73.5f;
	s3.resadd=new Address("pune","mh","ind",31202);//containment achieved here
	s3.dd=new MyDate(2,6,2004);//containment achieved here
	
	f1=new Faculty(201,"Swapnil",90000,new Address("satara","mh","ind",435627),new MyDate(5,9,2011));//containment achieved here
	
	System.out.println(s1);
	System.out.println();
	System.out.println(s2);
	System.out.println();
	System.out.println(s3);
	System.out.println();
	System.out.println(f1);
	System.out.println("***********************************************");
	System.out.println();
	
	//Inheritance is achieved here 
	JuniorStudent s4=new JuniorStudent();
	s4.branchName="Science";
	s4.setRollNo(34);
	s4.setName("Girish");
	s4.setResadd(new Address("Nashik","mh","ind",987364));
	System.out.println(s4);
	
	
}
}
