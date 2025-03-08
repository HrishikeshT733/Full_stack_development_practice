   import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class employee{
	//POJO class---Plain old Java object
	
	int id;
	String name;
	double sal;
	public employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public employee() {
		super();
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

class IdComparator implements Comparator<employee>{
	public int compare(employee e1,employee e2){
		if(e1.id>e2.id){
			return 1;
		}else if(e1.id<e2.id){
			return -1;
		}else {
			return 0;
		}
	}
}

class NameComparator implements Comparator<employee>{
	public int compare(employee e1,employee e2){
		return e1.name.compareTo(e2.name);
	}
}
class SalaryComparator implements Comparator<employee>{
	public int compare(employee e1,employee e2){
		if(e1.sal>e2.sal){
			return 1;
		}else if(e1.sal<e2.sal){
			return -1;
		}else {
			return 0;
		}
	}
}
public class TestComparator {
public static void main(String[] args) {
	ArrayList<employee>a1=new ArrayList<employee>();
	a1.add(new employee(101,"meena",25000));
	a1.add(new employee(102,"deepa",30000));
	a1.add(new employee(110,"samira",55000));
	a1.add(new employee(104,"diya",10000));
	a1.add(new employee(105,"aasha",47000));
	
	System.out.println("Student name before sorting:");
	for(employee s1:a1){
		System.out.println(s1);
	}
	System.out.println();
	//method referencing by instance
	Collections.sort(a1,new IdComparator()::compare);
	
	System.out.println("*************After sorting a1 is: Data sorted by Id **********************");
	for(employee s1:a1){
		System.out.println(s1);
	}
	System.out.println();
Collections.sort(a1,new NameComparator());
	
	System.out.println("*************After sorting a1 is: Data sorted by Name **********************");
	for(employee s1:a1){
		System.out.println(s1);
	}
	System.out.println();
	
Collections.sort(a1,new SalaryComparator());
	
	System.out.println("*************After sorting a1 is: Data sorted by Salary **********************");
	for(employee s1:a1){
		System.out.println(s1);
	}

}
}
