
public class SwapEmployeesArray {
public static void main(String[] args) {
	SwapEmployeesArray exe=new SwapEmployeesArray();
	Employee e1=new Employee("Ram",78990);
	Employee e2=new Employee("Radha",87000);
	
	Employee emp[]={e1,e2};
	
	System.out.println("Before swapping :"+emp[0]+" "+emp[1]);
	exe.swap(emp);
	System.out.println("After swapping :"+emp[0]+" "+emp[1]);
}
public void swap(Employee[] emp){
	Employee temp;
	temp=emp[0];
	emp[0]=emp[1];
	emp[1]=temp;
}
}
