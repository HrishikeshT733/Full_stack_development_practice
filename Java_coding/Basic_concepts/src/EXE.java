import java.awt.print.Printable;

import org.omg.Messaging.SyncScopeHelper;

public class EXE{
//start Execution
	 public static void main(String[] args){
	 
	 //Object Declaration
	 Student esha,yash,palak; //no memory allocation takes place at this step
	  yash=new Student();
	  yash.name="Yash Ghige";
	 //Object instantiation
	 esha=new Student(); //memory allocation takes place here 
	 esha.name="Esha Dhanve";
	 esha.rollNo=97; 
	 esha.p=70.00f;
	 esha.c=70.00f;
	 esha.m=70.00f;
	 esha.result=esha.calculateResult(esha.p,esha.c,esha.m); //ENCAPSULATION achieved here
	 System.out.println("Esha got ..."+esha.result);
	 
	 yash=new Student();//default constructor
	 yash.setName("Yash Ghige");
	 yash.setRollNo(25);
	 yash.setP(75.00f);
	 yash.setC(70.00f);
	 yash.setM(85.00f);
	 
	 yash.setResult(yash.calculateResult(yash.getP(), yash.getC(), yash.getM()));
	 System.out.println("Yash got:"+yash.getResult());
	 System.out.println("Details for yash:");
	 System.out.println("Roll No: "+yash.getRollNo());
	 
	 palak=new Student("Palak Mishra",47,98.00f,87.00f,38.00f);//parameterized constructor
	 System.out.println("Details are as: ");
	 System.out.println(palak.getName());
	 System.out.println(palak.getRollNo());
	 System.out.println(palak.p);
	
	 } 
}

