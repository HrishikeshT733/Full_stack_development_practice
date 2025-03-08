import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	char Operation;
	float num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	num1=sc.nextFloat();
	Operation=sc.next().charAt(0);
	num2=sc.nextFloat();
	
	
	switch(Operation){
	case '+':
		System.out.println("Addition is "+(num1+num2));
		break;
	case '-':
		System.out.println("Substraction is "+(num1-num2));
		break;
	case '*':
		System.out.println("Multiplication is "+(num1*num2));
		break;
	case '/':
		System.out.println("Division is "+(num1/num2));
		break;
	default:
		System.out.println("Wrong operation inserted");
	}
}
}
