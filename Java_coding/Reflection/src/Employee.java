
public class Employee {
		private int empID;
		protected String name;
		public float salary;
		private static int count;
		
		static {
			count=0;
		}

		public Employee(int empID, String name, float salary) {
			super();
			this.empID = empID;
			this.name = name;
			this.salary = salary;
			System.out.println("parametrize constructor"+" of employee");
		}

		public Employee() {
			super();
			count++;
			empID = 100;
			name = "ISha";
			salary = 98000;
			System.out.println("Defult constructor"+" of employee");
			
		}
		public void display() {
			System.out.println("Employee: EmpID: "+empID+"\tName:"+name+"\tsalary:"+salary);
		}
		private static int totalEmployee() {
			return count;
		}
		
}


