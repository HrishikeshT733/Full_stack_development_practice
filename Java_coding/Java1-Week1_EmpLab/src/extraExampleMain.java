
public class extraExampleMain {
	public static Student1 getstudentDetails(){
		Student1 s1=new Student1();
		s1.setId(101);
		s1.setName("Chandan");
		int[] marks={90,70,80};
		//checking whether entered marks having range between 0 and 100
	    for(int i=0;i<marks.length;i++){
	    	if(marks[i]>100 || marks[i]<0){
	    		s1.setName("invalid");//this is jugad to check word 'invalid' string in main method
	    		return s1;
	    	}
	    }
	    //checking whether no of subjects is greater than 0
	    if(marks.length==0){
	    	return s1=null;
	    }
	    
	    
		s1.setMarks(marks);
		return s1;
		}
	
public static void main(String[] args) {
	int length=1;
	Student1[] stud=new Student1[length];//for multiple students
	for(int i=0;i<stud.length;i++){//for multiple students
		
		stud[i]=new Student1();
	
	stud[i]=getstudentDetails();
	
	
	if(stud[i]==null){
		System.out.println("Invalid no of subjects");
		stud[i]=getstudentDetails();//it is because to get valid input from the user again
	}else if(stud[i].getName()=="invalid"){
		System.out.println("Invalid marks");
		stud[i]=null;
		stud[i]=getstudentDetails();//it is because to get valid input from the user again
	}
	else{
	stud[i].calculateAverage(stud[i].getMarks());
	stud[i].findGrade();
	System.out.println(stud[i]);
	}
	
	}
}
}
