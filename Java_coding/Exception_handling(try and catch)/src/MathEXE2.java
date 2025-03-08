

import java.util.Scanner;

public class MathEXE2{
public static void main(String[] args) {
	int num1=10,num2=0;
	int arr[]= {1,2,3,4,5};
	System.out.println("Result of Addition:"+(num1+num2));
	try {
			System.out.println("Result of Division:"+(num1/num2));
			System.out.println(arr[7]);
	}catch(ArithmeticException e) {
			System.out.println("Mathematical error / by zero not possible");
	 }catch (ArrayIndexOutOfBoundsException e) {
		 	System.out.println("Array out of index means "+"arr[6] has no value");
		 	
	}catch (Exception e) {
			System.out.println(e);
	}finally {
		System.out.println("You are best");
		
	}
	
	System.out.println("Result of Multiplication:"+(num1*num2));
	System.out.println("Maths operation done");
	
}
}
