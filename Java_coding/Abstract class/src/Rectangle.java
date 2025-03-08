import java.util.Scanner;

public class Rectangle extends Shape{

	@Override
	public void calArea() {
		int length,breadth;
		System.out.println("Enter length and breadth of rectangle: ");
		Scanner sr=new Scanner(System.in);
		length=sr.nextInt();
		breadth=sr.nextInt();
		area=length*breadth;
		System.out.println("Area of rectangle is :"+area);
		
	}

}
