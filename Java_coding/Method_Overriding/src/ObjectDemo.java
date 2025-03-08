//Object class
public class ObjectDemo {
public static void main(String[] args) {
	Object emp1=new Employee();
	Object emp2=emp1;
	Object emp3=new Employee();
	String str1="pune";
	
	System.out.println("emp1 hashcode: "+emp1.hashCode());//print memory address of emp1
	System.out.println("emp2 hashcode: "+emp2.hashCode());
	System.out.println("emp3 hashcode: "+emp3.hashCode());
	if(emp1.equals(emp2)){
		System.out.println("EQUAL");
	}
	else{
		System.out.println("DIFFERENT");
	} 
	if(str1.equals("pune")){//here comparision is between values
	System.out.println("EQUAL");
	}
	else{
			System.out.println("DIFFERENT");
		}
	
	if(emp1.equals(emp3)){//here it checks reference equality (memory location).
		System.out.println("EQUAL");
	}
	else{
		System.out.println("DIFFERENT");
	} 
	//If equals() is not overridden, it behaves like == (compares memory location).
	//If equals() is overridden, it compares the actual content (values) of the object.
}
}
