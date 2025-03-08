 import java.util.Scanner;

public class MathEXE {
	public static void main(String[] args) {
		int num1=10,num2=0;
		int []arr=new  int[3];
		System.out.println("Result of Addition:"+(num1+num2));
		try {
			System.out.println("Result of Division:"+(num1/num2));
			System.out.println(arr[4]);
		}catch(Exception e) {
			//GetMessage method
			String msg=e.getMessage();
			System.err.println(msg);
		    e.printStackTrace();
			//Handling Logic
			Scanner sc=new Scanner(System.in);
			System.out.print("Re Enter num2 value:");
			num2=sc.nextInt();
			System.out.println("Result of division: "+(num1/num2));
		}
		
		System.out.println("Result of Multiplication:"+(num1*num2));
		System.out.println("Maths operation done");
	}
}
