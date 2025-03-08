
public class Infosys {
public static void main(String[] args) {
	HR emp1=new HR("Radha",101,20000,8000);
	//method overriding achieved here
	emp1.attendace();
	System.out.println(emp1.calSal(20));
	emp1.fun();//special method of HR class ,not override any parent class method
	
	
	//here if we declare emp2 as Employee ,special methods from Manager class cannot be used because Employee(parent) can't revoke its child class(manager) special methods
	Employee emp2=new Manager("Ram",102,40000,2);
	emp2.attendace();
	System.out.println(emp2.calSal(30));
	
	Tester emp3=new Tester("Karan",103,50000);
	emp3.attendace();
	System.out.println(emp3.calSal(10));
	
	
}
}
