//RTTI-Runtime time type identification
//Dynamic data type governs method selection
public class Persistent {
public static void displayData(Employee emp){
	emp.attendace();
	emp.calSal(30);
	//Typecasting is required here to invoke HR class special methods because here emp has Employee as static type and HR as dynamic type
      if(emp instanceof HR){
    	  HR h=(HR) emp; //here we do typecasting of Employee to HR class
           h.fun();      
      }
      else if(emp instanceof Manager){
    	  Manager mg=(Manager) emp;
    	  mg.dailyMeeting();
      } 
      
}
public static void main(String[] args) {
	Employee emp1= new HR("Ram", 101, 20000, 1000); //here HR is dynamic type of emp1 and Employee is static type of emp1
	Employee emp2=new Employee("Rajesh", 102, 30000);//here Employee is dynamic type of emp2 and Employee is static type of emp2
	Employee emp3=new Manager("Suresh", 103, 40000, 2);//here Manager is dynamic type of emp3 and Employee is static type of emp3
	
	displayData(emp1); 
	System.out.println();
	displayData(emp2);
	System.out.println();
	displayData(emp3);
	
}
}
