import java.util.Scanner;

public class DivisionDemo {
public static void main(String[] args) throws ArithmeticException{
	int a;
	int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number for division: ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(b!=0){
		int c=a/b;
		System.out.println("Division is : "+c);
	}
		else
		throw new ArithmeticException("Divide by 0 is not possible");
		
	 
}
}
