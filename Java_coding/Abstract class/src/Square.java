import java.util.Scanner;

public class Square extends Shape{

	@Override
	public void calArea() {
		int length;
		System.out.println("Enter length of square: ");
		Scanner sr=new Scanner(System.in);
		length=sr.nextInt();
		area=length*length;
		System.out.println("Area of Square is :"+area);
		
	}

}
