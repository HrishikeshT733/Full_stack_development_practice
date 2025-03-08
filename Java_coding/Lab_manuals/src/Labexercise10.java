
public class Labexercise10 {
 public static void main(String[] args) {
	Employee e=new Employee(101, "Sandesh", 29000, 1000, 0, 0, new Date(2,3,2009));//Containment achieved
	e.calGrosssal();
	e.calNetsal();
	System.out.println(e);
	
}
}
