import java.util.Scanner;

public class DivisionDemo2 {
public static void main(String[] args) {
	int a;
	int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number for division: ");
		a=sc.nextInt();
		b=sc.nextInt();
	try{
		int c=a/b;
		System.out.println("Division is : "+c);
	} catch(ArithmeticException e){
		System.err.println("Division by 0 is not possible");
		System.out.println("Again enter the second number");
		b=sc.nextInt();
		int c=a/b;
		System.out.println("Division is : "+c);
	}
	
		
	 
}
}

